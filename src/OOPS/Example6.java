package OOPS;

    class Student {
        int id;
        String name;
        String department;


        public void printStudentDetails() {
            System.out.println("StudentID :" + id);
            System.out.println("name :" + name);
            System.out.println("Department :" + department);
            System.out.println("\n");
        }
    }


    public class Example6 {

        public static void main(String[] args) {

            Student std1 = new Student();
            std1.printStudentDetails();

            std1.id =101;
            std1.name ="Deepak";
            std1.department = "CSE";
            std1.printStudentDetails();

        }
    }


