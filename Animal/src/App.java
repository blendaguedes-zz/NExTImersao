import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("Escreva qual tipo de animal você quer criar:\nCachorro\nPeixe\nCobra");
        Scanner sc = new Scanner(System.in);

        String tipoAnimal = sc.nextLine();

        switch(tipoAnimal){
            case "Cachorro":
                Cachorro cachorro = new Cachorro();
                caractetisticasAnimal(tipoAnimal, cachorro);
                break;

            case "Cobra":
                Cobra cobra = new Cobra();
                caractetisticasAnimal(tipoAnimal, cobra);
                break;
            
            case "Peixe":
                Peixe peixe = new Peixe();
                caractetisticasAnimal(tipoAnimal, peixe);
                break;
            default:
                System.out.println("Animal inválido!");           

        }

        sc.close();
    }

    public static void caractetisticasAnimal(String tipoAnimal, Animal animal){

        System.out.println("O " + tipoAnimal + " é " + animal.alimentar() +
        ".\nEste animal se locomove " + animal.locomover() + ". E emite o som ");
        animal.emitirSom();
    }
}
