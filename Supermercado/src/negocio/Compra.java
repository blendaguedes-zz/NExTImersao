package negocio;
import dados.Item;
import dados.Pedido;
import dados.Produto;

public class Compra {
    
    public static void fazerCompra(){

        Pedido pedido = new Pedido();

        //comprando 2 pacotes de leite
        // 1 coca cola        
        Produto produtoLeite = new Produto(01);
        Produto produtoCoca = new Produto(02);

        // produto Leite
        produtoLeite.setDescricao("Leite em pó");
        produtoLeite.setValor(5.0);
        //set quantidade de estoque para exemplo
        produtoLeite.setQuantidadeEstoque(1);

        // produto Coca
        produtoCoca.setDescricao("Coca-cola 2L");
        produtoCoca.setValor(6.0);
        //set quantidade de estoque para exemplo
        produtoCoca.setQuantidadeEstoque(5);         

        Item item1 = new Item();
        Item item2 = new Item();

        item1.setProduto(produtoLeite);
        item1.setQuantidadeItem(2);        
        item2.setProduto(produtoCoca);
        item2.setQuantidadeItem(1);

        System.out.println("Se existir estoque disponível retornar 'true'" + temEstoque);

    }

    public static boolean verificarEstoque(Item item){
        boolean disponivel = false;        

        if(item.getProduto().getQuantidadeEstoque()>=item.getQuantidadeItem()){
            disponivel = true;
        }

        return disponivel;
    }
    
    public static void main(String[] args) {
        fazerCompra();
    }
}
