public class ContaEspecial extends ContaCorrente{

    public ContaEspecial(String numero, String agencia){

        super(numero, agencia);      
    }

    public ContaEspecial(String numero){

        super(numero, "0001");      
    }

    public ContaEspecial(){

        super("numero", "0001");      
    }

    public static void main(String[] args) {
        
        // ContaEspecial contaEspecial = new ContaEspecial();
        // contaEspecial.getAgencia();
        // contaEspecial.getChequeEspecial();

        ContaEspecial contaEspecial1 = new ContaEspecial("", "");
        // ContaEspecial contaEspecial2 = new ContaEspecial();
    }


    
}
