package dominio;

import java.util.ArrayList;

public class Pedido {
    
    private ArrayList<Item> item;
    private String tipoPagamento;

    public ArrayList<Item> getItem() {
        return this.item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    public String getTipoPagamento() {
        return this.tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

}
