package lab02;

/**
 * Representa um resumo individual para simplificar a classe RegistroResumos, que contem um tema e um conteudo
 */
public class Resumo {

    String conteudo;
    String tema;

    /**
     * Construtor que inicializa o resumo com um tema e um conteudo
     *
     * @param tema  tema do resumo
     * @param conteudo conteudo do resumo
     */
    public Resumo(String tema, String conteudo){
        this.conteudo = conteudo;
        this.tema = tema;
    }

    /**
     * Retorna o tema do resumo
     *
     * @return Nome do tema
     */
    public String getConteudo(){
        return this.conteudo;
    }

    /**
     * Retorna o conteudo do resumo
     *
     * @return Nome do conteudo
     */
    public String getTema(){
        return this.tema;
    }

    /**
     * Retorna a representação de uma String formada com tema e conteudo do resumo
     *
     * @return String formatada com o tema e o texto
     */
    @Override
    public String toString(){
        return "Tema: " + this.tema + "Conteudo: " + this.conteudo;
    }
}

