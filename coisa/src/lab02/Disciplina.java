package lab02;

public class Disciplina {
    private int horas = 0;
    private double nota1 = 0;
    private double nota2 = 0;
    private double nota3 = 0;
    private double nota4 = 0;
    private String nomeDisciplina;


    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horas){
        this.horas += horas;
    }

    public void cadastraNota(int nota, double valorNota){
        switch (nota){
            case 1:
                this.nota1 = valorNota;
                break;
            case 2:
                this.nota2 = valorNota;
                break;
            case 3:
                this.nota3 = valorNota;
                break;
            case 4:
                this.nota4 = valorNota;
                break;
        }
    }

    public boolean aprovado(){
        if((nota1 + nota2 + nota3 + nota4) / 4 >= 7 ){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Nome da disciplina: " + this.nomeDisciplina + " Tempo de estudo: " + this.horas + " Média: " + (nota1 + nota2 + nota3 + nota4)/4
                + "Nota1: " + nota1
                + "Nota2: " + nota2
                + "Nota3: " + nota3
                + "Nota4: " + nota4;
    }


}



