package lab02;

public class Resumo {

    String conteudo;
    String tema;

    public Resumo(String tema, String conteudo){
        this.conteudo = conteudo;
        this.tema = tema;
    }

    public String getConteudo(){
        return this.conteudo;
    }

    public String getTema(){
        return this.tema;
    }

    @Override
    public String toString(){
        return "Tema: " + this.tema + "Conteudo: " + this.conteudo;
    }
}

