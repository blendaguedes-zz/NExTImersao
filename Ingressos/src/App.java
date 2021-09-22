public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Teste Ingressos e afins!");

        IngressoVIP ingressoVIP = new IngressoVIP(150.0, 60.0);   

        Ingresso ingresso = new Ingresso(150.0);

        ingresso.getValor();

        ingressoVIP.getValor();

        ingresso.toString();

        ingressoVIP.toString(); // Overwriting / Sobrescrita

        System.out.println(ingresso.toString());

        System.out.println(ingressoVIP.toString());

        System.out.println(ingressoVIP.toString("Ivete "));

        Ingresso ingressoSubTipo = new IngressoVIP();

        ingressoSubTipo.toString();
        // ingressoSubTipo.toString("adsasd");


    }
}
