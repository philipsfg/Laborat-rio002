package Film;

public class Filme {
    private String nomeFilme;
    private String anoFilme;
    private String localFilme;
    private int posicao;
    private boolean isHot = false;

    Filme(int posicao, String nome, String ano, String local){
        this.nomeFilme = nome;
        this.anoFilme = ano;
        this.localFilme = local;
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

    public int getPosicao(){
        return posicao;
    }

    public boolean isHot(){
        return isHot;
    }

    public String detalharFilme(){
        if (isHot){
            return "🔥" + this.nomeFilme + ", " + this.anoFilme + "\n" + this.localFilme;
        }
        return this.nomeFilme + ", " + this.anoFilme + "\n" + this.localFilme;
    }

    public void setIsHot(boolean novoValor){
        this.isHot = novoValor;
    }

    public boolean getIsHot(){
        return isHot;
    }

    @Override
    public String toString() {
        return getNomeFilme() + ", " + getAnoFilme() + "\n" + getLocalFilme();
    }
}