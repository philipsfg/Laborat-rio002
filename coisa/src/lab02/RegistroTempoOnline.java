package lab02;

public class RegistroTempoOnline {

    private int tempoOnlineEsperado;
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
        this.tempoOnlineEsperado += tempo;
    }

    public boolean atingiuMetaTempoOnline(){
        if(tempoOnlineEsperado >= 120){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Nome da disciplina: " + this.nomeDisciplina + " Tempo online: " + this.tempo + " Tempo online esperado: " + this.tempoOnlineEsperado;
    }
}

