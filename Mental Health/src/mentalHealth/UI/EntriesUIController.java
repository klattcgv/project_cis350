package mentalHealth.UI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import mentalHealth.Main;
import mentalHealth.userData;
import mentalHealth.userSaveData;

import java.io.IOException;
import java.util.ResourceBundle;

public class EntriesUIController implements Initializable{
    //private Main main = new Main();

    @FXML
    private DatePicker myDate;

    @FXML
    private ChoiceBox<String> monthList;
    private String[] monthChoices = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

    @FXML
    private ChoiceBox<String> myMood;
    private String[] mood = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    @FXML
    private TextArea myDiary;

    @FXML
    private void saveEntries() throws IOException {
        String notes = myDiary.getText();
        String date = String.valueOf(myDate.getValue());
        int currentMood = Integer.parseInt(myMood.getValue());
        String[] splitDate = date.split("-");
        int day = Integer.parseInt(splitDate[2]);
        int month = Integer.parseInt(splitDate[1]);
        userData u1 = new userData(currentMood,notes,day,month,date);

        userSaveData test = new userSaveData();

        test.saveUserData(u1);

        userSaveData.saveToFile();
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
