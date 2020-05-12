public class Question {

    //Each Question will have a title but generic response answers
    private String Questiontitle;


    public Question(String Questiontitle) {
        this.Questiontitle = Questiontitle;
    }


    public String getQuestion() {
        return Questiontitle;
    }

    public void setQuestion(String question) {
        this.Questiontitle = question;
    }


}