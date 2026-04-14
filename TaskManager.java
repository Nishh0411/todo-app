import java.util.ArrayList;

public class TaskManager {
    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void viewTasks() {
        for (Task t : tasks) {
            t.display();
        }
    }

    public void markCompleted(int id) {
        for (Task t : tasks) {
            if (t.id == id) {
                t.isCompleted = true;
            }
        }
    }

    public void deleteTask(int id) {
        tasks.removeIf(t -> t.id == id);
    }
}