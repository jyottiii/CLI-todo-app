//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaskManager jyoti = new TaskManager();

        jyoti.addTask(1,"make eggs");
        jyoti.addTask(2,"do web homework");
        jyoti.addTask(3,"print lab work");

        jyoti.displayTasks();

        jyoti.removeTask(2);

        jyoti.displayTasks();
    }
}