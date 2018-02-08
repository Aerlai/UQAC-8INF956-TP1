package devoir2.question2;

public aspect EmailObserver extends ObserverProtocol{

    declare parents: Banque implements Subject;
    declare parents: Client implements Observer;

    private String Banque.cg;
    public void Banque.newConditionGeneral(String texte){
        this.cg = texte;
    }
    protected pointcut subjectChange(Subject s):
            (call(void Banque.newConditionGeneral(String))) && target(s);

    @Override
    protected void updateObserver(Subject s, Observer o) {
        String nom = ((Client)o).getNom();
        System.out.println(nom+" a recu une notification");
    }

    after(Banque b): target(b) && call(void ajouterClient(..)){
        Client c  = b.getClient(b.nombreDeClient()-1);
        EmailObserver.aspectOf().addObserver((Subject)b,(Observer)c);
    }


}
