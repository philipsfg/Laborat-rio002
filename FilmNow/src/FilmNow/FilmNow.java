package FilmNow;

import java.util.Scanner;

public class FilmNow {

    Filme[] filmes = new Filme[100];
    Filme[] hotList = new Filme[10];
    FilmNow(){

    }

    public String exibeMenu(){
        return "(A) Adicionar filme \n(M) Mostrar todos \n(D) Detalhar filme \n(E) Exibir HotList \n(H) Atribuir Hot \n(R) Remover Hot \n(S) Sair \n\nOpção> ";
    }

    public void adicionarFilme(int posicao, String nomeFilme, String anoFilme, String localFilme){
        if (posicao >= 1 && posicao <= 100){
            if(!existeFilme(nomeFilme, anoFilme)){
                if (!localFilme.isEmpty() || !nomeFilme.isEmpty()) {
                    filmes[posicao-1] = new Filme(nomeFilme, anoFilme, localFilme);
                }
                else{
                    System.out.println("FILME INVÁLIDO");
                }
            }
            else{
                System.out.println("FILME JA ADICIONADO");
            }
        }
        else{
            System.out.println("POSIÇÃO INVÁLIDA");
        }

    }

    private boolean existeFilme(String nome, String ano){
        for( Filme filme : filmes){
            if (filme != null){
                if (filme.getAnoFilme().equals(ano) && filme.getNomeFilme().equals(nome) ){
                    return true;
                }
            }
        }
        return false;
    }

    public String detalharFilme(int posicao){
        return filmes[posicao-1].detalharFilme();
    }

    public String mostrarTodos(){
        String todos = "";
        for (int i = 0; i < filmes.length; i++){
        if (filmes[i] != null){
                todos += (i + 1) + " - " + filmes[i].getNomeFilme() + "\n";
            }
        }
        return todos;
    }

    public void atribuirHot(int posicaoFilme, int posicaoHotList){
        if (posicaoHotList >= 1 && posicaoHotList <= 10){
            hotList[posicaoHotList-1] = new Filme(filmes[posicaoFilme-1].getNomeFilme(), filmes[posicaoFilme-1].getAnoFilme(), filmes[posicaoFilme-1].getLocalFilme());
            filmes[posicaoFilme-1].setIsHot(true);
        }
        else{
            System.out.println("POSIÇÃO INVÁLIDA");
        }
    }

    public String exibirHotList(){
        String todos = "";
        for (int i = 0; i < hotList.length; i++){
            if( hotList[i] != null){
                todos += (      i+1) + " - " + hotList[i].getNomeFilme() + ", " + hotList[i].getAnoFilme();
            }
        }
        return todos;
    }

    public void removerHot(int posicao){
        for (int i = 0; i < filmes.length; i++){
            if (filmes[i] != null){
                if (filmes[i].getNomeFilme().equals(hotList[posicao-1].getNomeFilme())){
                    filmes[i].setIsHot(false);
                }
            }
        }
        hotList[posicao] = null;

    }












}
