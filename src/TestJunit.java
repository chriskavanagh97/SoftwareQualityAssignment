import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertThat;


public class TestJunit {
    ArrayList<Survey> surveys = new ArrayList<>();
    Controller controller = new Controller("first survey");
    ArrayList<Question> questions = new ArrayList<>();




    @Test
    public void CreatingSurvey() {
        Controller controller = new Controller("first survey");


        assertEquals("first survey", controller.CreateSurvey().getName());

    }

   @Test
    public void SurveyAddQuestion()
    {

        assertEquals("Overall Quality",controller.createSurveyQuestions("Service Quality", "Overall Quality").getName());
    }

    @Test
    public void addMultipleQuestions()
    {
        Question one = new Question("Customer Service");
        Question Two = new Question("Cleanliness");
        //Collection to represent questions
        ArrayList<Question> questions = new ArrayList<Question>();
        //adding question to list
        questions.add(one);
        questions.add(Two);

       Survey newsurvey = controller.SurveyMultipleQuestions("MyQuestions", questions);

        assertTrue(newsurvey.getQuestions().contains(one));


    }

    @Test
    public void SurveyCountQuestions()
    {

        Question one = new Question("Quality");
        Question Two = new Question("Time management");
        Question Three = new Question("Customer Service");
        //Collection to represent questions
        //adding question to list
        questions.add(one);
        questions.add(Two);
        questions.add(Three);

        Survey newsurvey = controller.SurveyMultipleQuestions("MyQuestions", questions);

        assertEquals(3,newsurvey.getQuestions().size());
    }

    @Test
    public void TestingMultipleSurveys()
    {
        Survey survey1 = new Survey("first Survey");
        Survey survey2 = new Survey("Second Survey");
        Survey survey3 = new Survey("Third Survey");

        surveys.add(survey1);
        surveys.add(survey2);
        surveys.add(survey3);

        assertEquals(3, controller.MultipleSurveys(surveys).size());

    }




}