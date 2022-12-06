import common.exception.NotFoundInDatabase;
import services.extend.impl.FacilityServiceImpl;
import views.FuramaView;

public class MainApp {
    public static void main(String[] args) {
        FuramaView furamaView = new FuramaView();
        furamaView.displayMainMenu();
    }
}