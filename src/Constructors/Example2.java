package Constructors;
class StudentDetails {
    private String studentName;
    private int studentID;
    private String email;
    private String department;

    // No Argument Constructors
    public StudentDetails() {
        studentName="Deepak";
        studentID = 101;
        email ="deepakniwalkar2@gmail.com";
        department="CSE";

    }
    // All Argument Constructors
    public StudentDetails(String studentName,int studentID,String email,String department){
        System.out.println("Student name:"+studentName);
        System.out.println("Student ID:"+studentID);
        System.out.println("Email:"+email);
        System.out.println("Department :"+department);

        System.out.println("----------------------------------");

    }
    public void studentData(){
        System.out.println("Student name:"+studentName);
        System.out.println("Student ID:"+studentID);
        System.out.println("Email:"+email);
        System.out.println("Department :"+department);
        System.out.println("----------------------------------");
    }

    public void setStudentName(String studentName){
        this.studentName =studentName;
    }
    public String getStudentName(){
        return studentName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
}
public class Example2 {
    public static void main(String[] args) {
        StudentDetails student1 = new StudentDetails();
        student1.studentData();
        StudentDetails student2 = new StudentDetails("Akhil",101,"akhilwabhitkar@gmail.com","CSE");


    }
}
