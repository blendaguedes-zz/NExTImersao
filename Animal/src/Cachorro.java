public class Cachorro extends Mamifero{

    public void emitirSom(){
        System.out.println("Au au!");
    }

    public void reagir(){
        System.out.println("Abana do rabo! Lamber! Pular!");
    }

    public void reagir(String frase){
        System.out.println(frase);
    }

    public String alimentar(){
        return "Carnívoro";
    }

    public String locomover(){
        return "Andar...";
    }
    
}
