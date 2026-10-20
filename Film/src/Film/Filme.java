package Film;


/**
 * O objeto filme que será usado nos arrays de FilmNow
 *
 * @author Filipe Gabriel
 */
public class Filme {
    private String nomeFilme;
    private String anoFilme;
    private String localFilme;
    private int posicao;
    private boolean isHot = false;

    /**
     * Construtor para criar o filme
     * @param posicao posição usada para colocar o filme no array
     * @param nome nome do filme que será criado
     * @param ano ano do filme que será criado
     * @param local local do filme que será criado
     */
    Filme(int posicao, String nome, String ano, String local){
        this.nomeFilme = nome;
        this.anoFilme = ano;
        this.localFilme = local;
    }

    /**
     * Usado para obter o Local do Filme
     * @return uma String do Local
     */
    public String getLocalFilme(){
        return localFilme;
    }
    /**
     * Usado para obter o Ano do Filme
     * @return uma String do Ano
     */
    public String getAnoFilme(){
        return anoFilme;
    }

    /**
     * Usado para obter o Nome do Filme
     * @return uma String do Nome
     */
    public String getNomeFilme(){
        return nomeFilme;
    }

    /**
     * Usado para obter a Posição do Filme
     * @return uma String da Posição
     */
    public int getPosicao(){
        return posicao;
    }

    /**
     * Usado para detalhar um determinado Filme
     * @return uma String das informações do Filme
     */
    public String detalharFilme(){
        if (isHot){
            return "🔥" + this.nomeFilme + ", " + this.anoFilme + "\n" + this.localFilme;
        }
        return this.nomeFilme + ", " + this.anoFilme + "\n" + this.localFilme;
    }

    /**
     * Usado para indicar que um Filme foi adicionado no HotList
     */
    public void setIsHot(boolean novoValor){
        this.isHot = novoValor;
    }

    /**
     * Usado para obter a descrição do Filme
     * @return uma String das informações do Filme
     */
    @Override
    public String toString() {
        return getNomeFilme() + ", " + getAnoFilme() + "\n" + getLocalFilme();
    }
}