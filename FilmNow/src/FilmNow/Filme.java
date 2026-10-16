package FilmNow;

public class Filme {
    private String nomeFilme;
    private String anoFilme;
    private String localFilme;
    private boolean isHot = false;
    private int posicaoFilme;

    Filme(int posicao, String nome, String ano, String local){
        this.posicaoFilme = posicao;
        this.nomeFilme = nome;
        this.anoFilme = ano;
        this.localFilme = local;
    }

    public int getPosicao(){
        return posicaoFilme;
    }

    public String getLocalFilme(){
        return localFilme;
    }

    public String getAnoFilme(){
        return anoFilme;
    }

    public String getNomeFilme(){
        return nomeFilme;
    }

    public boolean isHot(){
        return isHot;
    }

    public String detalharFilme(){
        return this.nomeFilme + ", " + this.anoFilme + "\n" + this.localFilme;
    }

    public void setIsHot(boolean novoValor){
        this.isHot = novoValor;
    }
}
