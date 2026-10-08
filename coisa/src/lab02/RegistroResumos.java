package lab02;

import java.util.Arrays;

/**
 * Armazena e gerencia resumos de temas e conteudos de estudo
 */
public class RegistroResumos {
    //nessa parte eu criaria a clase resumo e usaria apenas um array
    private Resumo[] resumos;
    private int temasi = 0;

    /**
     * Construtor que define a quantidade maxima de resumos.
     *
     * @param numeroDeResumos Define a capacidade máxima de resumos
     */
    public RegistroResumos(int numeroDeResumos) {
        resumos = new Resumo[numeroDeResumos];
    }

    /**
     * Adiciona um novo resumo com tema e conteudo, verificando que o tema não seja repetido
     *
     * @param tema tema do resumo
     * @param conteudo conteudo do resumo
     */
    public void adiciona(String tema, String conteudo) {
        boolean jaExisteTema = false;
        for (int i = 0; i < conta(); i++) {
            if (resumos[i] != null) {
                if (tema.equals(resumos[i].getTema())) {
                    jaExisteTema = true;
                }
            }
        }

        if (!jaExisteTema) {
            if (temasi == resumos.length) {
                temasi = 0;
            }
            resumos[temasi] = new Resumo(tema, conteudo);
            temasi++;
        }
    }

    /**
     * Retorna a quantidade atual de resumos cadastrados
     *
     * @return Total de resumos diferentes de null
     */
    public int conta() {
        int soma = 0;

        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] != null) {
                soma += 1;
            }
        }

        return soma;
    }

    /**
     * Retorna um array de todos os resumos cadastrados
     *
     * @return Array de Strings com os resumos
     */
    public String[] pegaResumos() {
        String[] resumosExiste = new String[conta()];

        for (int i = 0; i < resumosExiste.length; i++) {
            resumosExiste[i] = resumos[i].getTema() + ": " + resumos[i].getConteudo();
        }

        return resumosExiste;
    }
    /**
     * Imprime a lista formatada com a quantidade de resumos, os temas e os conteudos dos resumos
     *
     * @return String formatada com a quantidade, os temas e os conteudos
     */
    public String imprimeResumos() {
        int quantidade = conta();
        String imprime1 = "- " + quantidade + " resumo(s) cadastrado(s)\n";
        imprime1 += "- ";

        for (int i = 0; i < quantidade; i++) {
            imprime1 += resumos[i].getTema() + " ";
            if (i != quantidade - 1) {
                imprime1 += "| ";
            }
        }
        return imprime1;

    }

    /**
     * Verifica se existe algum resumo com o tema especificado.
     *
     * @param tema Tema a ser pesquisado.
     * @return true se o tema do conteudo ja foi cadastrado @return false se o tema do conteudo ainda nao foi cadastrado
     */
    public boolean temResumo(String tema) {
        boolean tem = false;

        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] != null) {
                if (resumos[i].getTema().equals(tema)) {
                    tem = true;
                    break;
                }
            }
        }

        return tem;
    }

    /**
     * Verifica se algum conteudo possui alguma palavra-chave especifica
     *
     * @param chaveDeBusca define a palavra-chave para a busca
     * @return um array de String com o tema e o conteudo do resumo que possui a palavra-chave
     */
    public String[] busca(String chaveDeBusca) {
        String[] buscas = new String[resumos.length];
        int quantidade = 0;
        for (int i = 0; i < resumos.length; i++) {
            boolean tem = false;
            if (resumos[i] != null) {
                String[] palavras = resumos[i].getConteudo().split(" ");
                for (String palavra : palavras) {
                    if (palavra.equalsIgnoreCase(chaveDeBusca)) {
                        tem = true;
                        buscas[quantidade] = "Tema: " + resumos[i].getTema() + " | " +  "Conteudo: " + resumos[i].getConteudo();
                        quantidade++;
                        break;
                    }
                }
            }
        }

        String[] buscasExiste = new String[quantidade];

        for (int i = 0; i < buscasExiste.length; i++)
            buscasExiste[i] = buscas[i];

        return buscasExiste;
    }
}
