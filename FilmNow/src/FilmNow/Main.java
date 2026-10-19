package FilmNow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        char opcao;
        Scanner scanner = new Scanner(System.in);

        FilmNow sistema = new FilmNow();

        while (true){
            System.out.print(sistema.exibeMenu());
            opcao = scanner.next().charAt(0);
            if (opcao == 'S'){
                break;
            }
            if (opcao == 'A' || opcao == 'M' || opcao == 'S' || opcao == 'D' || opcao == 'E' || opcao == 'H' || opcao == 'R'){
                if( opcao == 'A'){
                    System.out.print("Posição> ");
                    int posicao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome> ");
                    String nome = scanner.nextLine();
                    System.out.print("Ano> ");
                    String ano = scanner.nextLine();
                    System.out.print("Local> ");
                    String local = scanner.nextLine();

                    sistema.adicionarFilme(posicao, nome, ano, local);
                    System.out.println();
                }

                else if(opcao == 'D'){
                    System.out.print("Posição> ");
                    int posicao = scanner.nextInt();

                    System.out.println(sistema.detalharFilme(posicao));
                    System.out.println();
                }
                else if(opcao == 'M'){
                    System.out.println(sistema.mostrarTodos());
                }

                else if ( opcao == 'H'){
                    System.out.print("Filme> ");
                    int posicaoFilme = scanner.nextInt();
                    System.out.print("Posicao> ");
                    int posicaoHotList = scanner.nextInt();

                    sistema.atribuirHot(posicaoFilme, posicaoHotList);
                    System.out.println();
                }

                else if(opcao == 'E'){
                    System.out.println(sistema.exibirHotList());
                    System.out.println();

                } else if (opcao == 'R') {
                    System.out.print("Posição> ");
                    int posicao = scanner.nextInt();
                    sistema.removerHot(posicao);
                    System.out.println();
                }
            }
            else{
                System.out.print("OPÇÃO INVÁLIDA!\n\n");
            }

        }





    }
}
