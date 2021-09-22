public abstract class Animal{
    private double peso;
    private int idade;
    private int membros;

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return this.membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public abstract String locomover();

    public abstract String alimentar();

    public abstract void emitirSom();


}