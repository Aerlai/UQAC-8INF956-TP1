package devoir2.question2;

import java.util.ArrayList;

public class Client {
    // Variable
    private ArrayList tabCompte;
    private String nom;
    private int numeroDeClient;
    private int nombreDeComptes;

    // Constructeur
    public Client(String nom, int id){
        this.nom = nom;
        this.numeroDeClient = id;
        this.nombreDeComptes = 0;
    }

    // Getters
    public int getNbreCompte(){
        try {
            return this.tabCompte.size();
        }catch(Exception e){
            System.out.println("Il n'y pas de comtpe associé à ce client");
            return 0;
        }
    }
    public Compte getCompte(int numeroDeCompte){
        return tabCompte[numeroDeCompte];
    }
    // Setters
    public void setNom(String nom){
        this.nom = nom;
    }

    // Methodes
    public void ajouterCompte(){
        this.tabCompte[this.nombreDeComptes] = new Compte();
        this.nombreDeComptes++;
    }

    public void fermerCompte(int num){
        try {
            this.tabCompte[num] = null;
            this.nombreDeComptes--;
        }catch(Exception e){
            System.out.println("le compte n'existe pas");
        }
    }

}
