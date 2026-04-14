public class Task {
    int id;
    String description;
    boolean isCompleted;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.isCompleted = false;
    }

    public void display() {
        String status = isCompleted ? "✔" : "✘";
        System.out.println(id + ". " + description + " [" + status + "]");
    }
}