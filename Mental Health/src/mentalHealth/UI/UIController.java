package mentalHealth.UI;
import javafx.fxml.FXML;
import mentalHealth.Main;
import java.io.IOException;

public class UIController {
    private Main main = new Main();

    @FXML
    private void getCalendar() throws IOException {
        main.showCalendarView();
    }

    @FXML
    private void getDashBoard() throws IOException {
        main.showMainItemView();
    }

    @FXML
    private void getStat() throws IOException {
        main.showStatView();
    }

    @FXML
    private void getEntries() throws IOException {
        main.showNewEntriesView();
    }

    @FXML
    private void getTask() throws IOException {
        main.showMyTaskView();
    }



}
