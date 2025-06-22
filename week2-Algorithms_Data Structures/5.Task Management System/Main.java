public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Adding tasks
        taskList.addTask(new Task(1, "Design UI", "Pending"));
        taskList.addTask(new Task(2, "Develop Backend", "In Progress"));
        taskList.addTask(new Task(3, "Test System", "Pending"));

        // Traversing tasks
        taskList.listTasks();

        // Searching task
        System.out.println("\n🔍 Searching for Task ID 2:");
        Task task = taskList.searchTask(2);
        System.out.println(task != null ? task : "Task not found");

        // Deleting task
        System.out.println("\n🗑️ Deleting Task ID 2:");
        taskList.deleteTask(2);

        // Traversing after deletion
        taskList.listTasks();
    }
}
