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
            if (opcao != 'A' || opcao != 'M' || opcao != 'S' || opcao != 'D' || opcao != 'E' || opcao != 'H' || opcao != 'R'){
                System.out.print("OPÇÃO INVÁLIDA!\n\n");
            }
        }





    }
}
