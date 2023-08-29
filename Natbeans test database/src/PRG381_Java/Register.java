package PRG381_Java;

public class Register {
    private int registerID;
    private String studentName;
    private String studentAddress;
    private String studentEmail;
    private String studentPassword;
    private String courseName;

    // Constructors
    public Register(int registerID, String studentName, String studentAddress, String studentEmail, String studentPassword, String courseName) {
        this.registerID = registerID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentEmail = studentEmail;
        this.studentPassword = studentPassword;
        this.courseName = courseName;
    }

    // Getters and Setters
    public int getRegisterID() {
        return registerID;
    }

    public void setRegisterID(int registerID) {
        this.registerID = registerID;
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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}


