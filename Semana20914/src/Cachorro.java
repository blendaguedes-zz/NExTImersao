public class Cachorro {

    String nome;
    String raca = "PUG";
    double altura;
    double peso;
    static String cor;

    private static void latirBaixo(String nome){
      
        System.out.println("Dentro do método\n" + nome + " diz: au au!");
    }

    public static void latir(String frase){
        latirBaixo("sad");
    }

    public static void main(String[] args) throws Exception {

        // Cachorro dog1 = new Cachorro();
        // dog1.cor = "Branco";
        // dog1.nome = "";

        // Cachorro.cor = "Marrom";

        // dog1.altura = 1.2;

        latirBaixo("Juju");        
        
    }
}