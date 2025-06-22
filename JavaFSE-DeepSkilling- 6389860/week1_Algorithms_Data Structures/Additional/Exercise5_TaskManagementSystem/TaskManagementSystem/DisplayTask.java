public class DisplayTask {
    public static void display(Task obj){
        System.out.println("Task Id: "+obj.taskId);
        System.out.println("Task Name: "+obj.taskName);
        System.out.println("Task Status: "+(obj.status ? "Completed" : "Not Completed"));
    }
}
