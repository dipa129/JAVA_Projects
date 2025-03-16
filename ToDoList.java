import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();
        int choice;

        System.out.println("Welcome to the To-Do List Application!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add a task
                    System.out.print("Enter the task to add: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    // View tasks
                    System.out.println("\nYour To-Do List:");
                    if (toDoList.isEmpty()) {
                        System.out.println("Your list is empty.");
                    } else {
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    break;

                case 3:
                    // Remove a task
                    System.out.println("\nYour To-Do List:");
                    if (toDoList.isEmpty()) {
                        System.out.println("Your list is empty. Nothing to remove.");
                    } else {
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                        System.out.print("Enter the task number to remove: ");
                        int taskNumber = scanner.nextInt();
                        if (taskNumber > 0 && taskNumber <= toDoList.size()) {
                            toDoList.remove(taskNumber - 1);
                            System.out.println("Task removed successfully!");
                        } else {
                            System.out.println("Invalid task number. Try again.");
                        }
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Thank you for using the To-Do List Application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
