public class Peixe extends Animal{

    private String corEscama;

    public String getCorEscama() {
        return this.corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public String alimentar(){
        return "";
    }

    public void emitirSom(){
        System.out.println("Glub glub!");
    }

    public String locomover(){
        return "Nada...";
    }

    
    
}
