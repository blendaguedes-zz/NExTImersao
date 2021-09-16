package negocio;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.Item;
import dominio.Pedido;
import dominio.Produto;


// cliente (programadora) diz qual o pedido
// SE um dos itens não está disponível ENTÃO não é possível concluir compra

public class Compra {

    public static void fazerCompra() {
        // comprando 2 pacotes de leite
        // 1 coca cola
        Produto produtoLeite = new Produto(01);
        Produto produtoCoca = new Produto(02);

        // produto Leite
        produtoLeite.setDescricao("Leite em pó");
        produtoLeite.setValor(5.0);
        // set quantidade de estoque para exemplo
        produtoLeite.setQuantidadeEstoque(2);

        // produto Coca
        produtoCoca.setDescricao("Coca-cola 2L");
        produtoCoca.setValor(6.0);
        // set quantidade de estoque para exemplo
        produtoCoca.setQuantidadeEstoque(5);


        // Criando os itens
        Item item1 = new Item();
        Item item2 = new Item();

        item1.setProduto(produtoLeite);
        item1.setQuantidadeItem(2);

        item2.setProduto(produtoCoca);
        item2.setQuantidadeItem(1);

        // Adicionando uma lista de itens
        Item[] arrayItens = new Item[2];
        ArrayList<Item> arrListItens = new ArrayList<>();

        arrayItens[0] = item1;
        arrListItens.add(item1);

        arrayItens[1] = item2;
        arrListItens.add(item2);

        // Verifica o se todos os itens estão no estoque
        // A regra de negócio diz: Se algum dos itens não estiver no estoque a compra não pode ser concluída.
        boolean podeComprar = verificarListaEstoque(arrListItens);        

        // Se está tudo OK com os itens do pedido então ele é concluído
        if (podeComprar) {
            Pedido pedido = new Pedido();

            pedido.setItem(arrListItens);
                
            // Calcula o total do pedido
            double totalPedido = calcularCompra(pedido);

            System.out.println("O total do seu pedido é: " + totalPedido);
            System.out.println("Digite a forma de pagamento: ");

            // Pede que o usuário insira a forma de pagamento
            Scanner sc = new Scanner(System.in);
            String formaPagamento = sc.nextLine();
            System.out.println("Compra executada com sucesso. Usando o método de pagamento " 
                + formaPagamento + ".");
            sc.close();

        }else{
            // Se um dos itens está faltoso então o pedido não pode ser concluído. 
            System.out.println("No seu pedido, existem itens sem estoque. Volte mais tarde.");
        }

    }

    // para cada item
    // quantidadeItem * produto.valor

    // Método que calcula o valor total da compra
    public static double calcularCompra(Pedido pedido) {

        ArrayList<Item> listaCompras = pedido.getItem();
        double totalCompra = 0.0;

        for (Item item : listaCompras) {
            // através do item é possível pegar o Produto e assim o atributo 'valor'
            double valorProduto = item.getProduto().getValor();
            double quantidadeItem = item.getQuantidadeItem();

            totalCompra = totalCompra + (valorProduto * quantidadeItem);
        }
        return totalCompra;
    }

    // Verificando se o item está disponível no estoque na quantidade que o cliente quer
    public static boolean verificarEstoque(Item item) {
        boolean disponivel = false;
        if (item.getProduto().getQuantidadeEstoque() >= item.getQuantidadeItem()) {
            disponivel = true;
        }
        return disponivel;
    }

    // Verificando todos os itens, se um estiver fora de estoque o método já retorna falso
    public static boolean verificarListaEstoque(ArrayList<Item> itens){
        boolean podeComprar = true;
        
        for (Item item : itens) {
            if(verificarEstoque(item) == false){
                podeComprar = false;
                break;
            }            
        }
        return  podeComprar;
    }

    public static void main(String[] args) {
        fazerCompra();
        
        // ArrayList itens = new ArrayList<>();
        // itens.add("aksdjfh");
        // itens.add(1231);

        // ArrayList<Item> itens2 = new ArrayList<>();
        
        // // itens2.add(38274);

        // Item item = new Item();
        // itens2.add(item);


        // ArrayList<String> arrString = new ArrayList<>();

        // arrString.add("Nome de alguém");
        // arrString.add("Carros"); // adicionar item
        // arrString.get(0); // pegar item de indice específico

        // for (String palavra : arrString) {
        //    System.out.println(palavra);
        // }
        // System.out.println(arrString.get(1));
    }
}
