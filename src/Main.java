//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.loadTasksFromFile("tasks.txt");
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to CLI Task Manager!");
        System.out.println("Available commands:");
        System.out.println("- add <id> \"<task name>\"");
        System.out.println("- removetask <id>");
        System.out.println("- taskcomplete <id>");
        System.out.println("- display");
        System.out.println("- save");
        System.out.println("- exit");

        while (true) {
            System.out.print("> ");
            String input = sc.nextLine().trim();

            // Exit command
            if (input.equalsIgnoreCase("exit")) break;

            String[] parts = input.split(" ", 3); // at most 3 parts

            if (parts[0].equalsIgnoreCase("add")) {
                try {
                    int id = Integer.parseInt(parts[1]);
                    String name = parts[2].replaceAll("\"", "");
                    manager.addTask(id, name);
                } catch (Exception e) {
                    System.out.println("Invalid format. Use: add <id> \"<task name>\"");
                }
            } else if (parts[0].equalsIgnoreCase("removetask")) {
                try {
                    int id = Integer.parseInt(parts[1]);
                    manager.removeTask(id);
                } catch (Exception e) {
                    System.out.println("Use: removetask <id>");
                }
            } else if (parts[0].equalsIgnoreCase("taskcomplete")) {
                try {
                    int id = Integer.parseInt(parts[1]);
                    manager.changeStatus(id);
                } catch (Exception e) {
                    System.out.println("Use: taskcomplete <id>");
                }
            } else if (parts[0].equalsIgnoreCase("display")) {
                manager.displayTasks();
            } else if (parts[0].equalsIgnoreCase("save")) {
                manager.saveTasksToFile("tasks.txt");
            } else {
                System.out.println("Unknown command. Try again.");
            }
        }

        System.out.println("Goodbye!");
    }
}