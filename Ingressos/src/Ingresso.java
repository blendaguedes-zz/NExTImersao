public class Ingresso{

    private double valor;

    public Ingresso(){

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
        return String.valueOf(this.valor);
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