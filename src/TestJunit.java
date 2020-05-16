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
    public void SurveyCountQuestions()
    {

        assertEquals(1,controller.createSurveyQuestions("Service Quality", "Overall Quality").getQuestions().size());
    }




}