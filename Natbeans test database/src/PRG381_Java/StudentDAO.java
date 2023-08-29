package PRG381_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/bcstudents?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234567890";

    public void addStudent(Students student) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "INSERT INTO student (Student_ID, student_name, student_address, student_email, student_password) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, student.getStudentID());
            statement.setString(2, student.getStudentName());
            statement.setString(3, student.getStudentAddress());
            statement.setString(4, student.getStudentEmail());
            statement.setString(5, student.getStudentPassword());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Connection URL: " + URL);
    }

    public Students getStudent(int studentID) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "SELECT * FROM student WHERE Student_ID = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, studentID);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                String studentName = resultSet.getString("student_name");
                String studentAddress = resultSet.getString("student_address");
                String studentEmail = resultSet.getString("student_email");
                String studentPassword = resultSet.getString("student_password");
                return new Students(studentID, studentName, studentAddress, studentEmail, studentPassword);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateStudent(Students student) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "UPDATE student SET student_name = ?, student_address = ?, student_email = ?, student_password = ? WHERE Student_ID = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, student.getStudentName());
            statement.setString(2, student.getStudentAddress());
            statement.setString(3, student.getStudentEmail());
            statement.setString(4, student.getStudentPassword());
            statement.setInt(5, student.getStudentID());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int studentID) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "DELETE FROM student WHERE Student_ID = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, studentID);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
