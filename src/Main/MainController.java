package Main;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.util.Pair;

import java.util.Optional;

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
        // Create the custom dialog.
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("New Task");
        dialog.setHeaderText("Create a new Task");

        // Set the icon (must be included in the project).
//        dialog.setGraphic(new ImageView(this.getClass().getResource("newTask.png").toString()));

        // Set the button types.
        ButtonType newTaskButtonType = new ButtonType("Create", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(newTaskButtonType, ButtonType.CANCEL);

        // Create the title and description labels and fields.
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        TextField title = new TextField();
        title.setPromptText("Title");
        TextField description = new TextField();
        description.setPromptText("Description");

        grid.add(new Label("Title:"), 0, 0);
        grid.add(title, 1, 0);
        grid.add(new Label("Description:"), 0, 1);
        grid.add(description, 1, 1);

        // Enable/Disable newTask button depending on whether a title was entered.
        Node newTaskButton = dialog.getDialogPane().lookupButton(newTaskButtonType);
        newTaskButton.setDisable(true);

        // Do some validation (using the Java 8 lambda syntax).
        title.textProperty().addListener((observable, oldValue, newValue) -> {
            newTaskButton.setDisable(newValue.trim().isEmpty());
        });

        dialog.getDialogPane().setContent(grid);

        // Request focus on the title field by default.
        Platform.runLater(() -> title.requestFocus());

        // Convert the result to a title-description-pair when the newTask button is clicked.
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == newTaskButtonType) {
                return new Pair<>(title.getText(), description.getText());
            }
            return null;
        });

        Optional<Pair<String, String>> result = dialog.showAndWait();

        result.ifPresent(resultValues -> {
            actiontarget.setText("New Task Created!");
            Task newTask = new Task();
            newTask.setTitleText(resultValues.getKey());
            newTask.setDescriptionText(resultValues.getValue());
            backlogLane.getChildren().add(newTask);
        });

    }

}