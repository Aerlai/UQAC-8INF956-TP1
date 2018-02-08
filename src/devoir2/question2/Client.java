package devoir2.question2;

import java.util.ArrayList;

public class Client {
    // Variable
    private ArrayList<Compte> tabCompte = new ArrayList<>();
    private String nom;
    private int numeroDeClient;

    // Constructeur
    public Client(String nom, int id){
        this.nom = nom;
        this.numeroDeClient = id;
    }

    // Getters
    public int getNbreCompte(){
        return this.tabCompte.size();
    }
    public Compte getCompte(int numeroDeCompte){
        try {
            return tabCompte.get(numeroDeCompte);
        }catch(Exception e){
            System.out.println("Le compte n'existe pas");
            return null;
        }
    }
    // Setters
    public void setNom(String nom){
        this.nom = nom;
    }

    // Methodes
    public void ajouterCompte(){
        this.tabCompte.add(new Compte());
    }

    public void fermerCompte(int num){
        try {
            this.tabCompte.remove(num);
        }catch(Exception e){
            System.out.println("le compte n'existe pas");
        }
    }

}
