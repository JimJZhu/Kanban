package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

public class MainController {
    @FXML
    private Text actiontarget;
    @FXML
    private VBox backlogLane;

    @FXML
    public void initialize() {
    }

    @FXML
    protected void handleCreateNewTask(ActionEvent event) {
        actiontarget.setText("New Task Created!");
        Task test = new Task();
        backlogLane.getChildren().add(test);
    }

}