package lab02;

public class RegistroTempoOnline {

    private int tempoOnlineEsperado = 120;
    private String nomeDisciplina;
    private int tempo;

    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public void adicionaTempoOnline(int tempo){
        this.tempo += tempo;
    }

    public boolean atingiuMetaTempoOnline(){
        if(tempo >= tempoOnlineEsperado){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return this.nomeDisciplina + " " + this.tempo + "/" + this.tempoOnlineEsperado;
    }
}

