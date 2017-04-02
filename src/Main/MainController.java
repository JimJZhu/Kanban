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
    private FlowPane backlogLane;

    @FXML
    public void initialize() {
    }

    @FXML
    protected void handleCreateNewTask(ActionEvent event) {
        actiontarget.setText("New Task Created!");
        VBox test = new VBox();
        test.setStyle("-fx-border-color: black");
        test.getChildren().add(new Text("Hi"));
        backlogLane.getChildren().add(test);
    }

}