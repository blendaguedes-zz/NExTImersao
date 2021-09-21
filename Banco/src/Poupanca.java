public class Poupanca extends ContaBancaria{

    private static double taxaRendimento;

    public Poupanca(String numero, String agencia){
        super(numero, agencia);
    }
    
    public static double getTaxaRendimento() {
        return taxaRendimento;
    }

    public static void setTaxaRendimento(double taxaRendimento) {
        Poupanca.taxaRendimento = taxaRendimento;
    }

    public void rendimento(){
        double rendimento = this.getSaldo() * Poupanca.getTaxaRendimento();
        double novoSaldo = this.getSaldo() + rendimento;        
        this.setSaldo(novoSaldo);         
    }

    public void rendimentoBonus(double taxaBonus){
        double rendimentoBonus = this.getSaldo() * taxaBonus;
        double novoSaldo = this.getSaldo() + rendimentoBonus;
        this.setSaldo(novoSaldo);

    }

    public void creditar(double credito){
        double novoSaldo = this.getSaldo() + credito;
        this.setSaldo(novoSaldo);
    }

    public static void main(String[] args) {
        
        Poupanca p = new Poupanca("", "");
        p.getAgencia();

        // ContaBancaria cBancaria = new ContaBancaria();     

    }
    
}
