package PRG381_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/bcstudents?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234567890";

    public void addRegister(Register register) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "INSERT INTO Register (Register_ID, student_name, student_address, student_email, student_Password, Course_name) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, register.getRegisterID());
            statement.setString(2, register.getStudentName());
            statement.setString(3, register.getStudentAddress());
            statement.setString(4, register.getStudentEmail());
            statement.setString(5, register.getStudentPassword());
            statement.setString(6, register.getCourseName());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Register getRegister(int registerID) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "SELECT * FROM Register WHERE Register_ID = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, registerID);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                String studentName = resultSet.getString("student_name");
                String studentAddress = resultSet.getString("student_address");
                String studentEmail = resultSet.getString("student_email");
                String studentPassword = resultSet.getString("student_Password");
                String courseName = resultSet.getString("Course_name");
                return new Register(registerID, studentName, studentAddress, studentEmail, studentPassword, courseName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateRegister(Register register) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "UPDATE Register SET student_name = ?, student_address = ?, student_email = ?, student_Password = ?, Course_name = ? WHERE Register_ID = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, register.getStudentName());
            statement.setString(2, register.getStudentAddress());
            statement.setString(3, register.getStudentEmail());
            statement.setString(4, register.getStudentPassword());
            statement.setString(5, register.getCourseName());
            statement.setInt(6, register.getRegisterID());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteRegister(int registerID) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "DELETE FROM Register WHERE Register_ID = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, registerID);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
