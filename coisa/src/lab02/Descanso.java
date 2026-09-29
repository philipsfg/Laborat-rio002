package lab02;

public class Descanso {
    private int horas;
    private int semanas;

    public void defineHorasDescanso(int valor){
        this.horas = valor;
    }
    public void defineNumeroSemanas(int valor){
        this.semanas = valor;
    }

    public String getStatusGeral(){
        if(this.horas / this.semanas>= 26){
            return "Descansado";
        }
        return "Cansado";
    }



}
