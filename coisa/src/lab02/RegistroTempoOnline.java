package lab02;
/**
 * Controla o tempo de estudo online de um aluno para uma disciplina
 */
public class RegistroTempoOnline {

    private int tempoOnlineEsperado = 120;
    private String nomeDisciplina;
    private int tempo;

    /**
     * Construtor que recebe o nome da disciplina e a meta de tempo online.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param tempoOnlineEsperado objetivo de horas online
     */

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    /**
     * Construtor simplificado que não muda o padrão de 120 horas
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }


    /**
     * Adiciona tempo online ao total
     *
     * @param tempo tempo a ser adicionado
     */
    public void adicionaTempoOnline(int tempo){
        this.tempo += tempo;
    }

    /**
     * Verifica se a meta de tempo online foi atingida.
     *
     * @return true se atingiu a meta, se não @return false
     */
    public boolean atingiuMetaTempoOnline(){
        if(tempo >= tempoOnlineEsperado){
            return true;
        }
        return false;
    }

    /**
     * Retorna a representação em String do registro de horas na disciplina
     *
     * @return String com formatação para nomeDisciplina, tempo e a meta de tempo
     */

    @Override
    public String toString(){
        return this.nomeDisciplina + " " + this.tempo + "/" + this.tempoOnlineEsperado;
    }
}

