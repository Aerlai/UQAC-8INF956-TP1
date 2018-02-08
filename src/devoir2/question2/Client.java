package devoir2.question2;

public class Client {
    // Variable
    private Compte tabCompte[];
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
        return this.tabCompte.length;
    }
    public Compte getCompte(int numeroDeCompte){
        return tabCompte[numeroDeCompte]
    }
    // Setters
    public void setNom(String nom){
        this.nom = nom;
    }

    // Methodes
    public void ajouterCompte(){
        this.tabCompte[this.nombreDeComptes] = new Compte();
    }

    public void fermerCompte(){
        
    }

}
