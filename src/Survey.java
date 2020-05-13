import java.util.ArrayList;

public class Survey {


    //Each survey will have a title
    private String SurveyTitle;

    //Each survey must have a list of questions to facilitate questions being added
    private ArrayList<Question> questionList;


    public Survey()
    {

    }
    //Constructor taking in a name and list of questions
    public Survey(String SurveyTitle, ArrayList<Question> questionList) {
        this.SurveyTitle = SurveyTitle;
        this.questionList = questionList;
    }

    //Added in 2nd constructor so user can create an empty survey with just a name
    public Survey(String SurveyTitle){
        this.SurveyTitle = SurveyTitle;

    }

    //Add question method to allow question addition
    public void addQuestion(Question newQuestion)
    {
        this.questionList.add(newQuestion);
    }


    public String getName() {
        return SurveyTitle;
    }
    public void setName(String name) {
        this.SurveyTitle = name;
    }
    public ArrayList<Question> getQuestions() {
        return questionList;
    }
    public void setQuestions(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }

}