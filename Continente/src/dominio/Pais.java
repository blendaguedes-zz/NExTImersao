package dominio;

public class Pais {

    private String nome;
    private int pupulacao;
    private double dimensao;
    private Continente continente;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPupulacao() {
        return this.pupulacao;
    }

    public void setPupulacao(int pupulacao) {
        this.pupulacao = pupulacao;
    }

    public double getDimensao() {
        return this.dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }


    
}
