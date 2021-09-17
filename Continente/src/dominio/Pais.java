package dominio;

public class Pais {

    private String nome;
    private int populacao;
    private double dimensao;
    private Continente continente;

    public Continente getContinente() {
        return this.continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return this.populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return this.dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

}
