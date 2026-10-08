package lab02;

/**
 * Gerencia o registro de horas de descanso e semanas de um estudante
 */
public class Descanso {
    private int horas = 0;
    private int semanas = 0;


    /**
     * Define a quantidade de semanas.
     *
     * @param valor
     */
    public void defineHorasDescanso(int valor){
        this.horas = valor;
    }

    /**
     * Define a quantidade de semanas.
     *
     * @param valor
     */
    public void defineNumeroSemanas(int valor){
        this.semanas = valor;
    }

    /**
     * Mostra um status geral sobre o estudante, tendo dois resultados cansado/descansado
     */
    public String getStatusGeral(){
        if(this.horas == 0 && this.semanas == 0){
            return "cansado";
        }
        if(this.horas / this.semanas>= 26){
            return "descansado";
        }
        return "cansado";
    }



}
