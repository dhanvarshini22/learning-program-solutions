public class Main {
    public static void main(String[] args) {
        // Create model object
        Student student = new Student();
        student.setName("John Doe");
        student.setId("S101");
        student.setGrade("A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Display initial student data
        System.out.println("\n--- Initial Student Data ---");
        controller.updateView();

        // Update student data
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("A+");

        // Display updated student data
        System.out.println("\n--- Updated Student Data ---");
        controller.updateView();
    }
}
