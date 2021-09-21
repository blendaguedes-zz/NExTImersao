public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Teste Ingressos e afins!");

        Ingresso ingresso = new Ingresso(150.0);

        IngressoVIP ingressoVIP = new IngressoVIP(150.0, 60.0);        

        System.out.println(ingressoVIP.toString());

        System.out.println(ingressoVIP.toString());

    }
}
