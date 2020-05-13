import java.util.ArrayList;

public class Controller {


    public Controller()
    {

    }
    public String CreateSurvey()
    {
        Survey createSurvey = new Survey("Quality");

        return createSurvey.getName();
    }

    public String surveyQuestions()
    {
        //Creation of question object
        Question one = new Question("Customer Service");
        //Collection to represent questions
        ArrayList<Question> questions = new ArrayList<Question>();
        //adding question to list
        questions.add(one);

        Survey s = new Survey("My Questions" ,questions);
        
        return "true";
    }

}
