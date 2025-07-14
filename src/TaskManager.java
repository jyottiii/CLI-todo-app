import java.util.ArrayList;

public class TaskManager {

    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(int taskId, String taskName){
        Task t = new Task(taskId,taskName);
        tasks.add(t);
    }

    public void removeTask(int taskId){
        for(int i=0;i<tasks.size();i++){
            if(tasks.get(i).getTaskId()==taskId)
                tasks.remove(i);
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
}
