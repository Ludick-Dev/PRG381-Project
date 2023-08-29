package PRG381_Java;

public class Administrator {
    private int adminID;
    private String adminName;
    private String adminPassword;
    private String contact;

    // Constructors
    public Administrator(int adminID, String adminName, String adminPassword, String contact) {
        this.adminID = adminID;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.contact = contact;
    }

    // Getters and Setters
    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

