package devoir2.question2;

public class Compte {
    private int solde;
    private double taux;
    private int soldeMin;

    public Compte(int solde, double taux, int decouvertAutorise){
        this.solde = solde;
        this.taux = taux;
        this.soldeMin = decouvertAutorise;
    }

    public int getSolde() {
        return solde;
    }

    public void deposer(int solde) {
        this.solde += solde;
    }

    public void retirer(int solde) throws SoldeInsufisantException {
        int argent = this.solde - solde;
        if (argent < soldeMin){
            throw new SoldeInsufisantException();
        }
        this.solde = argent;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public int getSoldeMin() {
        return soldeMin;
    }

    public void setSoldeMin(int soldeMin) {
        this.soldeMin = soldeMin;
    }

}
