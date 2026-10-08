package lab02;

import java.util.Arrays;

public class RegistroResumos {
    //nessa parte eu criaria a clase resumo e usaria apenas um array
    private Resumo[] resumos;
    private int temasi = 0;

    public RegistroResumos(int numeroDeResumos) {
        resumos = new Resumo[numeroDeResumos];
    }

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

    public int conta() {
        int soma = 0;

        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] != null) {
                soma += 1;
            }
        }

        return soma;
    }

    public String[] pegaResumos() {
        String[] resumosExiste = new String[conta()];

        for (int i = 0; i < resumosExiste.length; i++) {
            resumosExiste[i] = resumos[i].getTema() + ": " + resumos[i].getConteudo();
        }

        return resumosExiste;
    }

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
