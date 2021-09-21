public class IngressoVIP extends Ingresso{

    private double valorAdicional;

    public IngressoVIP(){

    }

    public IngressoVIP(double valorAdicional){
        this.valorAdicional = valorAdicional;
    }

    public IngressoVIP(double valorIngresso, double valorAdicional){
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }    

    public double getValorAdicional() {
        return this.valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public String toString(){

        double valorTotal = this.getValor() + this.valorAdicional;
        String valorTotalString = Double.toString(valorTotal);

        return valorTotalString;
    }

    
}
