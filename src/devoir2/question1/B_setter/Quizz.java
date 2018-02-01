package devoir2.question1.B_setter;

public class Quizz implements QuizzMaster {
    private String type;
    private String question;
    private String [] choix;
    private int reponse;

    public Quizz ()
    {
        choix = new String [4];
    }

    public void setType(String type){
        this.type=type;
    }

    public void setChoix(String [] choix) {
        this.choix = choix;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setReponse(int reponse) {
        this.reponse = reponse;
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
