package devoir2.question2;

import java.util.ArrayList;

public class Banque {
    // Variable
    private int nombreDeClient = 0;
    private ArrayList<Client> tabClient = new ArrayList<>();

    // Constructeur
    public Banque(){

    }

    // Getters
    public Client getClient(int id){
        if(tabClient.get(id) == null){
            System.out.println("Le client n'existe pas");
        }
        return tabClient.get(id);
    }
    // Setters

    // Methodes
    public void ajouterClient(String nom) {
        tabClient.add(new Client(nom, nombreDeClient));
        nombreDeClient++;
    }

    public void supprimerClient(int id){
        if(tabClient.get(id) == null){
            System.out.println("Le  client n'existe pas");
        }
        else{
            System.out.println("Le client a été supprimé");
        }
        tabClient.remove(id);
    }

    public int nombreDeClient(){
        return tabClient.size();
    }


}
