package Film;

/**
 * Sistema que mantém os seus filmes prediletos. Podem existir 100 filmes.
 *
 * @author eliane
 *
 */
public class FilmNow {

    private static final int TAMANHO = 100;
    private static final int HOTS = 10;

    private Filme[] filmes; //uma representacao simploria da lista de filmes
    private Filme[] hotList;
    /**
     * Cria o FilmNow.
     */
    public FilmNow() {
        this.filmes = new Filme[TAMANHO];
        this.hotList = new Filme[HOTS];
    }

    /**
     * Acessa a lista de filmes mantida.
     * @return O array de filmes.
     */
    public Filme[] getFilmes() {
        return this.filmes.clone();
    }

    /**
     * Adiciona um filme em uma posição. Se já existir filme na posição, sobrescreve o anterior.
     * @param posicao Posição do filme.
     * @param nome Nome do filme.
     * @param ano Ano de lançamento do filme.
     * @param local Local onde o filme pode ser assitido.
     */
    public void cadastraFilme(int posicao, String nome, String ano, String local) {

        if (posicao >= 1 && posicao <= 100){
            if(!existeFilme(nome, ano)){
                if (!local.isEmpty() && !nome.isEmpty()) {
                    filmes[posicao-1] = new Filme(posicao, nome, ano, local);
                }
                else{
                    System.out.println("\nFILME INVÁLIDO");
                }
            }
            else{
                System.out.println("\nFILME JA ADICIONADO");
            }
        }
        else{
            System.out.println("\nPOSIÇÃO INVÁLIDA");
        }
    }

    /**
     * Verifica se o filme já existe no array de filmes
     * @param nome verfica se o nome do filme existe
     * @param ano verifica se o ano do filme existe
     * @return true se existir ou false se não existir
     */
    private boolean existeFilme(String nome, String ano){
        for( Filme filme : filmes){
            if (filme != null){
                if (filme.getAnoFilme().equals(ano) && filme.getNomeFilme().equals(nome) ){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Mostra os filmes que estão no HotList
     * @return o array de HotList
     */
    public Filme[] exibirHotList(){
        return this.hotList.clone();
    }

    /**
     * Adiciona um filme já adicionado ao HotList
     * @param posicaoFilme indica a posição do filme que será colocado no HotList
     * @param posicaoHotList indica a posição do HotList que o filme será adicionada
     */
    public void atribuirHotList(int posicaoFilme, int posicaoHotList){
        if (posicaoHotList >= 1 && posicaoHotList <= 10){
            hotList[posicaoHotList-1] = new Filme(filmes[posicaoFilme-1].getPosicao(), filmes[posicaoFilme-1].getNomeFilme(), filmes[posicaoFilme-1].getAnoFilme(), filmes[posicaoFilme-1].getLocalFilme());
            filmes[posicaoFilme-1].setIsHot(true);
        }
        else{
            System.out.println("POSIÇÃO INVÁLIDA");
        }
    }

    /**
     * Remove um filme que está adicionado ao HotList
     * @param posicao indica a posição que o filme será removido
     */
    public void removerHot(int posicao){
        for (int i = 0; i < filmes.length; i++){
            if (filmes[i] != null){
                if (filmes[i].getNomeFilme().equals(hotList[posicao-1].getNomeFilme())){
                    filmes[i].setIsHot(false);
                }
            }
        }
        hotList[posicao] = null;

    }

}