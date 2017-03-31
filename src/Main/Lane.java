package Main;

import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jim on 2017-03-29.
 */
public class Lane {

    private List<Task> tasks;

    public Lane() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void deleteTask(Task task) {
        tasks.remove(task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task getTask(int key) {
        return tasks.get(key);
    }
}
