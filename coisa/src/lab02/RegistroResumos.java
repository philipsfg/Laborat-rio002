package lab02;

public class RegistroResumos {
    private String[] temas;
    private String[] conteudos;
    private int temasi = 0;

    public RegistroResumos(int numeroDeResumos){
        conteudos = new String[numeroDeResumos];
        temas = new String[numeroDeResumos];
    }

    public void adiciona(String tema, String conteudo){
        boolean jaExisteTema = false;
        for(int i = 0; i < temas.length; i++){
            if(tema.equals(temas[i])){
                jaExisteTema = true;
            }
        }

        if(!jaExisteTema){
            if(temasi == temas.length){
                temasi = 0;
            }
            temas[temasi] = tema;
            conteudos[temasi] = conteudo;
            temasi ++;
        }
    }

    public int conta(){
        int soma = 0;

        for(int i = 0; i < temas.length; i++){
            if(temas[i] != null){
                soma += 1;
            }
        }

        return soma;
    }

    public String[] pegaResumos(){
        String[] resumos = new String[conta()];

        for(int i = 0; i < resumos.length; i++){
            resumos[i] = temas[i] + ": " + conteudos[i];
        }

        return resumos;
    }

    public String imprimeResumos(){
        int quantidade = conta();
        String imprime1 = "- " + quantidade + " resumo(s) cadastrado(s)\n";
        imprime1 += "- ";

        for(int i = 0; i < quantidade; i++){
            imprime1 += temas[i] + " ";
            if(i != quantidade - 1){
                imprime1 += "| ";
            }
        }
        return imprime1;

    }

    public boolean temResumo(String tema){
        boolean tem = false;

        for(int i = 0; i < temas.length; i++){
            if(temas[i] != null){
                if(temas[i].equals(tema)){
                    tem = true;
                    break;
                }
            }
        }

        return tem;
    }

}
