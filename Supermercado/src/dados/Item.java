package dados;
public class Item {
    
    private Produto produto;
    private int quantidadeItem;

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeItem() {
        return this.quantidadeItem;
    }

    public void setQuantidadeItem(int quantidade) {
        this.quantidadeItem = quantidade;
    }

}
