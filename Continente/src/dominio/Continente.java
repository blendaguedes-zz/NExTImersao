package dominio;

import java.util.ArrayList;

public class Continente{

    private String nome;
    private ArrayList<Pais> paises;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Pais> getPaises() {
        return this.paises;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }

    public Continente(String nome){
       this.nome = nome;
    }

    public void adicionarPais(Pais pais){     
        
        if (this.getPaises() == null){
            ArrayList<Pais> paisesList = new ArrayList<>();
            this.setPaises(paisesList);
        }
        this.getPaises().add(pais);
    }

    public double dimensaoContinente(){

        double dimensaoContinente = 0.0;

        for (Pais pais : this.getPaises()) {            
            dimensaoContinente = dimensaoContinente + pais.getDimensao();
        }

        return dimensaoContinente;
    }

    public int populacaoContinente(){

        int populacaoContinente = 0;

        for (Pais pais : this.getPaises()) {            
            populacaoContinente = populacaoContinente + pais.getPopulacao();
        }
        return populacaoContinente;
    }

    public double densidadePopulacional(){

        int populacaoContinente = this.populacaoContinente();
        double dimensaoContinente = this.dimensaoContinente();

        double densidadePopulacional = populacaoContinente/dimensaoContinente;

        return densidadePopulacional;
    }

    // Método de forma mais compacta
    // public double densidadePopulacional(){

    //     return this.populacaoContinente()/this.dimensaoContinente();

    // }

    public Pais paisMaiorPopulacao(){

        if(this.getPaises() == null){
            System.out.println("Este continente ainda não tem paises cadastrados!");
            return new Pais();
        }

        int maiorPopulacao = this.getPaises().get(0).getPopulacao();
        Pais paisMaiorPopulacao = this.getPaises().get(0);

        for (Pais pais : paises) {
            if(maiorPopulacao< pais.getPopulacao()){
                maiorPopulacao = pais.getPopulacao();
                paisMaiorPopulacao = pais;                
            }
        }
        return paisMaiorPopulacao;
    }

    public static void main(String[] args) {
        
        Continente continente = new Continente("Ásia");

        Pais paisJapao = new Pais();
        paisJapao.setNome("Japão");
        paisJapao.setPopulacao(126);
        paisJapao.setDimensao(377.0);

        Pais paisChina = new Pais();
        paisChina.setNome("China");
        paisChina.setPopulacao(1410);
        paisChina.setDimensao(9500.0);
        
        continente.adicionarPais(paisJapao);
        continente.adicionarPais(paisChina);

        System.out.println(continente.populacaoContinente());

        System.out.println(continente.dimensaoContinente());

        System.out.println(continente.densidadePopulacional());

        System.out.println(continente.paisMaiorPopulacao().getNome());


    }
}