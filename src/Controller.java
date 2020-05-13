public class Controller {


    public Controller()
    {

    }
    public String CreateSurvey()
    {
        Survey createSurvey = new Survey("Quality");

        return createSurvey.getName();
    }

}
