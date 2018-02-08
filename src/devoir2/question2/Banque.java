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

    public Client getClient(String nom) throws NomClientInconnuException {
        for(Client c : tabClient){
            if (c.getNom().equals(nom))
                return c;
        }
        throw new NomClientInconnuException();
    }
    // Setters

    // Methodes
    public void ajouterClient(String nom) {
        Client c = new Client(nom, nombreDeClient);
        tabClient.add(c);
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
