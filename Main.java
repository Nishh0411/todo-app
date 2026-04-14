import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        int idCounter = 1;

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String desc = sc.nextLine();
                    manager.addTask(new Task(idCounter++, desc));
                    break;

                case 2:
                    manager.viewTasks();
                    break;

                case 3:
                    System.out.print("Enter ID to mark complete: ");
                    int completeId = sc.nextInt();
                    manager.markCompleted(completeId);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    manager.deleteTask(deleteId);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}