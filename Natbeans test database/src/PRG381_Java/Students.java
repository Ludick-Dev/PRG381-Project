package PRG381_Java;

public class Students {
    private int studentID;
    private String studentName;
    private String studentAddress;
    private String studentEmail;
    private String studentPassword;

    // Constructors
    public Students(int studentID, String studentName, String studentAddress, String studentEmail, String studentPassword) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentEmail = studentEmail;
        this.studentPassword = studentPassword;
    }

    // Getters and Setters
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }
}
