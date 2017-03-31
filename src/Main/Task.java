package Main;

import org.joda.time.DateTime;

/**
 * Created by Jim on 2017-03-29.
 */
public class Task {
    private String title;
    private String description;
    private DateTime dateCreated;
    private DateTime dateDue;

    public Task() {
        this.title = "";
        this.dateCreated = new DateTime();
        this.dateDue = new DateTime(this.dateCreated.plusDays(1));
        this.description = "";
    }

    public DateTime getDateDue() {
        return dateDue;
    }

    public void setDateDue(DateTime dateDue) {
        this.dateDue = dateDue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DateTime getDateCreatede() {
        return dateCreated;
    }

    public void setDateCreated(DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
