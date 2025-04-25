package Methods;
    public class Example3 {
        public static void printStudentResult(String name,String subject,int marks,String grade,String excellent) {
            System.out.println("Name:"+name);
            System.out.println("Subject:"+subject);
            System.out.println("Marks:"+marks);
            System.out.println("Grade:"+grade);
            System.out.println("Remarks:"+excellent);
            System.out.println("-----------------------------");
        }

        public static void main(String[] args) {
            printStudentResult("Ankit","Math",88,"A","Excellent");
            printStudentResult("Priya","Science",76,"B","Good");
            printStudentResult("Ravi","English",65,"C","Average");
            printStudentResult("Deepak","Computer",95,"A+","OutStanding");

            // HINT: Method idea —
            // printStudentResult("Ankit", "Math", 88, "A", "Excellent");
        }
    }

