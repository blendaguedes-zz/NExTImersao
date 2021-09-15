package dados;
public class Pedido {
    
    private Item item;
    private String tipoPagamento;

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getTipoPagamento() {
        return this.tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

}
