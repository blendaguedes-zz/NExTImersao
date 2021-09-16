package dominio;
public class Produto{

    private final int codigo;
    private String descricao;
    private int quantidadeEstoque;
    private double valor;

    public int getCondigo() {
		return this.codigo;
	}

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public Produto(int codigo){
        this.codigo = codigo;
    }



}