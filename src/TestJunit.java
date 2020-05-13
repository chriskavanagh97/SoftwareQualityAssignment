import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThat;


public class TestJunit {

    List<Survey> list;

    @Test
    public void testAdd() {

        Controller controller = new Controller();
        assertEquals("Quality", controller.CreateSurvey());

    }


}