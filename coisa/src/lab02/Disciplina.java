package lab02;

import java.util.Arrays;

/**
 * Representa uma disciplina no sistema, permitindo administrar as horas de estudo,
 * sendo possivel registrar notas e calcular a média (simples ou ponderada)
 */
public class Disciplina {
    private int horas = 0;
    private double[] notas;
    private int[] pesos;
    int numeroDeNotas;
    private String nomeDisciplina;
    double media;
    boolean tempeso = false;


    /**
     * Construtor para disciplina com média simples
     *
     * @param nomeDisciplina nome da disciplina que está sendo administrada
     * @param numeroDeNotas quantidade total de notas para a disciplina
     */
    public Disciplina(String nomeDisciplina, int numeroDeNotas){
        this.notas = new double[numeroDeNotas];
        this.numeroDeNotas = numeroDeNotas;
        this.nomeDisciplina = nomeDisciplina;

    }

    /**
     * Construtor para disciplina com média ponderada
     *
     * @param nomeDisciplina nome da disciplina que está sendo administrada
     * @param numeroDeNotas quantidade total de notas para a disciplina
     * @param pesos representa um array com os pesos das notas respectivas
     */
    public Disciplina(String nomeDisciplina, int numeroDeNotas, int[] pesos){
        this.tempeso = true;
        this.notas = new double[numeroDeNotas];
        this.nomeDisciplina = nomeDisciplina;
        this.numeroDeNotas = numeroDeNotas;
        this.pesos = pesos;

    }

    /**
     * Registra as horas acumuladas de estudo na disciplina
     *
     * @param horas quantidade de horas para adicionar
     */
    public void cadastraHoras(int horas){
        this.horas += horas;
    }

    /**
     * Regista o valor de uma nota em uma determinada posição
     *
     * @param nota numero da respectiva nota
     * @param valorNota valor do numero da nota
     */
    public void cadastraNota(int nota, double valorNota){
        notas[nota - 1] = valorNota;
    }

    /**
     * Verifica se o aluno foi aprovado de acordo com a media obtida
     *
     * @return true se a media for maior ou igual a 7.0, caso contrário @return false
     */
    public boolean aprovado(){
        return calculaMedia() >= 7.0;
    }

    /**
     * Calcula e devolve a media do aluno simples ou ponderada
     *
     * @return Valor decimal da media calculada
     */
    public double calculaMedia() {
        double somanotas = 0;
        double somapesos = 0;

        if (tempeso) {
            for (int i = 0; i < numeroDeNotas; i++) {
                somanotas += notas[i] * pesos[i];
                somapesos += pesos[i];
            }
            this.media = somanotas/somapesos;
            return somanotas/somapesos;
            }
        else {
            for (int i = 0; i < numeroDeNotas; i++) {
                somanotas += notas[i];
            }
            this.media = somanotas/numeroDeNotas;
            return somanotas/numeroDeNotas;
        }
    }


    /**
     * Retorna a representação na forma de String dos dados da disciplina
     *
     * @return String formatada com nome, horas, média e a lista das notas
     */
    @Override
    public String toString(){
        return this.nomeDisciplina + " " + this.horas + " " + this.media + " " + Arrays.toString(notas);
    }


}



