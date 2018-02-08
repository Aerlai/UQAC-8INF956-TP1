package devoir2.question2;

public class Banque {
    // Variable
    private int nombreDeClient = 0;
    private Client tabClient[];

    // Constructeur
    public Banque(){

    }

    // Methodes
    public void ajouterClient(String nom){
        tabClient[nombreDeClient] = new Client(nom);
        nombreDeClient++;
    }
}
