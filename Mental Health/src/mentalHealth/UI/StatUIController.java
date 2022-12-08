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

public class StatUIController implements Initializable{

    @FXML
    private ChoiceBox<String> monthList;
    private String[] monthChoices = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
    }
}
