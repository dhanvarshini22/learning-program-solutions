public class TaskLinkedList {
    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    // Add task at end
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Search task by ID
    public Task searchTask(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.taskId == id)
                return temp.task;
            temp = temp.next;
        }
        return null;
    }

    // Delete task by ID
    public void deleteTask(int id) {
        if (head == null) return;

        if (head.task.taskId == id) {
            head = head.next;
            System.out.println("✅ Task deleted.");
            return;
        }

        Node prev = null;
        Node curr = head;
        while (curr != null && curr.task.taskId != id) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
            System.out.println("✅ Task deleted.");
        } else {
            System.out.println("❌ Task not found.");
        }
    }

    // Traverse and print tasks
    public void listTasks() {
        Node temp = head;
        System.out.println("📋 Task List:");
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }
}
