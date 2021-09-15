public class Conta {
    
    private final int id;
    private String nome;
    private double saldo;
    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;       
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String rua, String numero, String bairro) {
        this.endereco = rua + ", n " + numero + ", " + bairro;        
    }
    
    public Conta(int id){
        this.id = id;
    }

    public static void main(String[] args) {

        Conta contaA = new Conta(10);
        
        contaA.setSaldo(500.0);
        contaA.getNome();
        contaA.setEndereco("Rua São Joao" , "23", "Peixinhos");

        // System.out.println(contaA.saldo);
        // System.out.println(contaA.saldo);
    }
}
