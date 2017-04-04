package Main;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import org.joda.time.DateTime;

/**
 * Created by Jim on 2017-03-29.
 */
public class Task extends VBox {

    private Text title;
    private Text description;

    public Task() {
        this.title = new Text("New Title");
        this.description = new Text("New Description");
        this.getChildren().addAll(title, description);
        this.setId("Task");
//        this.setStyle("-fx-border-color: black");
    }

    public Text getTitle() {
        return title;
    }

    public void setTitle(Text title) {
        this.title = title;
    }

    public void setTitleText(String title) {
        this.title.setText(title);
    }

    public Text getDescription() {
        return description;
    }

    public void setDescription(Text description) {
        this.description = description;
    }

    public void setDescriptionText(String description) {
        this.description.setText(description);
    }
}
