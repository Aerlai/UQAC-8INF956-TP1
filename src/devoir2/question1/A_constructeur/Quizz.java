package devoir2.question1.A_constructeur;

public class Quizz implements QuizzMaster {
    private String type;
    private String question;
    private String [] choix;
    private int reponse;

    public Quizz (String typeXML, String q, String r1, String r2, String r3, String r4, int rep)
    {
        type=typeXML;
        choix = new String [4];
        question = q;
        choix[0] = r1;
        choix[1] = r2;
        choix[2] = r3;
        choix[3] = r4;
        reponse = rep;
    }

    @Override
    public String getChoix(int indice) {
        // TODO Auto-generated method stub
        return choix[indice];
    }

    @Override
    public String getQuestion() {
        // TODO Auto-generated method stub
        return question;
    }

    @Override
    public int getReponse() {
        // TODO Auto-generated method stub
        return (reponse);
    }
    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return type;
    }
}
