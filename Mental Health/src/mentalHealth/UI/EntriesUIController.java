package mentalHealth.UI;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.time.LocalDate;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import mentalHealth.Main;

import java.io.IOException;
import java.util.ResourceBundle;

public class EntriesUIController implements Initializable{
    //private Main main = new Main();

    @FXML
    private DatePicker myDate;

    @FXML
    private ChoiceBox<String> myMood;

    private String[] mood = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    @FXML
    private void saveEntries() throws IOException {

    }

    @FXML
    private void pickDate() throws IOException {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        myMood.getItems().addAll(mood);
        myMood.setOnAction(this::getMood);
    }

    int moodRate = 0;

    private void getMood(javafx.event.ActionEvent actionEvent){
        moodRate = Integer.parseInt(myMood.getValue());
    }
}
