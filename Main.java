package mentalHealth;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.application.Application;

public class Main extends Application{
    private static Stage primaryStage;
    private static BorderPane MainLayout;

    @Override
    public void start(Stage primaryStage) throws IOException{
        //Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Mental Tracker App");
        showMainView();
        showMainItemView();
    }

    public void showMainItemView() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("UI/MainItemView.fxml"));
        BorderPane mainItem = loader.load();
        MainLayout.setCenter(mainItem);
    }

    public void showCalendarView() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("UI/CalendarItem.fxml"));
        BorderPane CalendarItem = loader.load();
        MainLayout.setCenter(CalendarItem);
    }

    public void showMyTaskView() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("UI/MyTaskItem.fxml"));
        BorderPane taskItem = loader.load();
        MainLayout.setCenter(taskItem);
    }

    public void showNewEntriesView() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("UI/NewEntriesView.fxml"));
        BorderPane entriesItem = loader.load();
        MainLayout.setCenter(entriesItem);
    }

    public static void showStatView() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("UI/StatView.fxml"));
        BorderPane statItem = loader.load();
        MainLayout.setCenter(statItem);
    }

    public void showMainView() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("UI/MainView.fxml"));
        MainLayout = loader.load();
        Scene scene = new Scene(MainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String args[])
    {
        launch(args);
    }
}
