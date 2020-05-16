import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class Controller {

    ArrayList<Survey> surveys = new ArrayList<>();
    String a = "quality";

    public Controller(String a)
    {
        this.a = a;

    }

    public Survey CreateSurvey()
    {
        Survey createSurvey = new Survey(a);
        return createSurvey;
    }


    public Survey createSurveyQuestions(String questionname,String surveytitle )
    {
        //Creation of question object
        Question firstquestion = new Question(questionname);
        //Collection to represent questions
        ArrayList<Question> questions = new ArrayList<Question>();
        //adding question to list
        questions.add(firstquestion);

        Survey firstquestionsurvey = new Survey(surveytitle ,questions);

        return firstquestionsurvey;

    }

  public Survey SurveyMultipleQuestions(String surveyname,  ArrayList<Question> questions )
  {
      Survey createSurvey = new Survey(surveyname, questions);


      return createSurvey;
  }

}
