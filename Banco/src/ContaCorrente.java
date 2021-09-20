public class ContaCorrente extends ContaBancaria{    

    private double chequeEspecial;
    private double pacoteServicos;

    public ContaCorrente(String numero, String agencia){
        
        super(numero, agencia);
    }

    public double getPacoteServicos() {
        return this.pacoteServicos;
    }

    public void setPacoteServicos(double pacoteServicos) {
        this.pacoteServicos = pacoteServicos;
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }


}
