package PRG381_Java;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        // Create a new student
        Students newStudent = new Students(3, "gjsafbn Naaier", "18 grhH St", "johlhgougrG@example.com", "opf8hbguty");

        // Add the student to the database
        studentDAO.addStudent(newStudent);
        

        System.out.println("Student added successfully.");
    }
}
