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

    public static void adicionarPais(Pais pais){

        Continente continente = new Continente("Ásia");       
        
        ArrayList<Pais> paisesList = new ArrayList<>();
        continente.setPaises(paisesList);

        continente.getPaises().add(pais);

        System.out.println(continente.getPaises().get(0));
        System.out.println(continente.getNome());
        
        // System.out.println(continente.getPaises());
        // continente.setPaises(paisesList);
    }

    public static void main(String[] args) {
        Continente.adicionarPais(new Pais());
  
    }
}