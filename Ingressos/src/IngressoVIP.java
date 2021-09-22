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

    @Override
    public String toString(){

        double valorTotal = this.getValor() + this.valorAdicional;
        String valorTotalString = Double.toString(valorTotal);

        return valorTotalString;
    }

    public String toString(String artista){

        double valorTotal = this.getValor() + this.valorAdicional;
        String valorTotalString = Double.toString(valorTotal);

        String frase = "O show de " + artista + "custará: " + valorTotalString;
        return frase;
    }

    
}
