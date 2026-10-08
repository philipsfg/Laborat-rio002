package lab02;

import java.util.Arrays;

public class Disciplina {
    private int horas = 0;
    private double[] notas;
    private int[] pesos;
    int numeroDeNotas;
    private String nomeDisciplina;
    double media;
    boolean tempeso = false;



    public Disciplina(String nomeDisciplina, int numeroDeNotas){
        this.notas = new double[numeroDeNotas];
        this.numeroDeNotas = numeroDeNotas;
        this.nomeDisciplina = nomeDisciplina;

    }

    public Disciplina(String nomeDisciplina, int numeroDeNotas, int[] pesos){
        this.tempeso = true;
        this.notas = new double[numeroDeNotas];
        this.nomeDisciplina = nomeDisciplina;
        this.numeroDeNotas = numeroDeNotas;
        this.pesos = pesos;

    }


    public void cadastraHoras(int horas){
        this.horas += horas;
    }

    public void cadastraNota(int nota, double valorNota){
        notas[nota - 1] = valorNota;
    }

    public boolean aprovado(){
        int soma = 0;

        for(double nota : notas){
            soma += nota;
        }
        if( soma/ 4 >= 7 ){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        int somanotas = 0;
        int somapesos = 0;
        if (tempeso){
            for (int i = 0; i < numeroDeNotas ; i++){
                somanotas += notas[i] * pesos[i];
                somapesos += pesos[i];
            }
            this.media = somanotas/somapesos;
        }
        else{
            for (int i = 0; i < numeroDeNotas ; i++) {
                somanotas += notas[i];
            }

            this.media = somanotas/numeroDeNotas;
        }


        return this.nomeDisciplina + " " + this.horas + " " + this.media + " " + Arrays.toString(notas);
    }


}



