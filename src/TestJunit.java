import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertThat;


public class TestJunit {
    ArrayList<Survey> surveys = new ArrayList<>();


    @Test
    public void testAdd() {

        Controller controller = new Controller();
        assertEquals("Quality", controller.CreateSurvey());

    }

    @Test
    public void Creationofsurvey()
    {

        Survey firstsurvey = new Survey();

        surveys.add(firstsurvey);
        assertTrue("first survey belongs to survey",surveys.contains(firstsurvey));
    }

    @Test
    public void createSurveyQuestions()
    {
        //Creation of question object
        Question firstquestion = new Question("Quality");
        //Collection to represent questions
        ArrayList<Question> questions = new ArrayList<Question>();
        //adding question to list
        questions.add(firstquestion);

        Survey firstquestionsurvey = new Survey("Quality Questions" ,questions);
        surveys.add(firstquestionsurvey);

        assertTrue("Survey belongs to survey",surveys.contains(firstquestionsurvey));
    }


}