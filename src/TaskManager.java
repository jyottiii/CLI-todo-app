import java.util.ArrayList;
import java.io.*;

public class TaskManager {

    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(int taskId, String taskName){
        Task t = new Task(taskId,taskName);
        tasks.add(t);
    }


    public void removeTask(int taskId){
        for(int i=0;i<tasks.size();i++){
            if(tasks.get(i).getTaskId()==taskId) {
                tasks.remove(i);
                break;
            }
        }
    }

    public void displayTasks(){
        for(Task t: tasks){
            System.out.println(t);
        }
    }

    public void changeStatus(int taskId){
        for (Task t : tasks) {
            if (t.getTaskId() == taskId) {
                t.changeTaskStatus();
                break;
            }
        }
    }

    public void saveTasksToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Task t : tasks) {
                writer.write(t.getTaskId() + "," + t.getTaskName() + "," + t.getTaskStatus());
                writer.newLine(); // New line for next task
            }
            System.out.println("Tasks saved to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while saving tasks: " + e.getMessage());
        }
    }

    public void loadTasksFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 3); // format: id,name,status
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String status = parts[2];

                    Task task = new Task(id, name, status);
                    tasks.add(task);
                }
            }
            System.out.println("Tasks loaded from " + filename);
        } catch (IOException e) {
            System.out.println("No saved tasks found. Starting fresh.");
        }
    }


}
