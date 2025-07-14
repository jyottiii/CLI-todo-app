public class Task {

    private final int taskId;
    private final String taskName;
    private String taskStatus;

    public Task(int taskId, String taskName){
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskStatus = "pending";
    }

    public int getTaskId(){
        return taskId;
    }

    public String getTaskName(){
        return taskName;
    }

    public String getTaskStatus(){
        return taskStatus;
    }

    public String toString(){
        return (taskId +" : "+taskName+" : "+ taskStatus);
    }

    public void changeTaskStatus(){
        this.taskStatus = "completed";
    }
}
