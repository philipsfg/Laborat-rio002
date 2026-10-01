package lab02;

public class Descanso {
    private int horas = 0;
    private int semanas = 0;

    public void defineHorasDescanso(int valor){
        this.horas = valor;
    }
    public void defineNumeroSemanas(int valor){
        this.semanas = valor;
    }

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
