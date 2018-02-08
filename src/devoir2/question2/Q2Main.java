package devoir2.question2;

public class Q2Main {
    public static void main(String[] args) {
        Banque b = new Banque();
        b.ajouterClient("Client1");
        b.ajouterClient("Client2");
        b.ajouterClient("Client3");
        b.ajouterClient("Client4");
        b.ajouterClient("Client5");
        b.ajouterClient("Client6");

        Client c1;
        try {
            c1 = b.getClient("Client1");
            c1.ajouterCompte(1000,0.005,-500);
            Compte compteClient1 = c1.getCompte(0);
            compteClient1.deposer(100);
            compteClient1.retirer(1300);

        } catch (NomClientInconnuException e) {
            e.printStackTrace();
        } catch (SoldeInsufisantException e) {
            e.printStackTrace();
        }

        b.newConditionGeneral("Le taux d'interet passera dans 2 jours à 0.000001%");
    }
}
