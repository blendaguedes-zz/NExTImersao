public class Ingresso{

    private double valor;
    private final double DESCONTO_INGRESSO = 0.1;

    public Ingresso(){
    }

    public double getDESCONTO_INGRESSO() {
        return DESCONTO_INGRESSO;
    }

    public Ingresso(double valor){
        this.valor = valor;
    }    

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString(){
        String valoringresso = String.valueOf(this.valor); 
        return valoringresso;
    }

    public final double valorDesconto(){

        return 0;
    }

    public static void main(String[] args) {
        
        Ingresso ingresso = new Ingresso();

        double n = 2.0;
        String nString = String.valueOf(n);

        String nStringDouble = Double.toString(n);
        ingresso.setValor(120);

        System.out.println(ingresso.toString());

        ingresso.toString();

    }

}