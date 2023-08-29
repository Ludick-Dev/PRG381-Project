package PRG381_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdministratorDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/bcstudents?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234567890";
    


    public void addAdministrator(Administrator admin) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "INSERT INTO administrator (Admin_ID, Admin_name, Admin_password, Contact) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, admin.getAdminID());
            statement.setString(2, admin.getAdminName());
            statement.setString(3, admin.getAdminPassword());
            statement.setString(4, admin.getContact());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Administrator getAdministrator(int adminID) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "SELECT * FROM administrator WHERE Admin_ID = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, adminID);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                String adminName = resultSet.getString("Admin_name");
                String adminPassword = resultSet.getString("Admin_password");
                String contact = resultSet.getString("Contact");
                return new Administrator(adminID, adminName, adminPassword, contact);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateAdministrator(Administrator admin) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "UPDATE administrator SET Admin_name = ?, Admin_password = ?, Contact = ? WHERE Admin_ID = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, admin.getAdminName());
            statement.setString(2, admin.getAdminPassword());
            statement.setString(3, admin.getContact());
            statement.setInt(4, admin.getAdminID());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAdministrator(int adminID) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "DELETE FROM administrator WHERE Admin_ID = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, adminID);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}

