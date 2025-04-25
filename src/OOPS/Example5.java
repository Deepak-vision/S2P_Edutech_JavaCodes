package OOPS;

    class employee {
        private int employeeId;
        private String employeeName;
        private double salary;
        private byte workingHour;

        public void setEmployeeId(int id){
            employeeId = id;
        }
        public int getEmployeeId(){
            return employeeId;
        }

        public void setEmployeeName(String name){
            employeeName = name;
        }
        public String getEmployeeName(){
            return employeeName;
        }

        public void setSalary(double sal ){
            salary =sal;
        }
        public  double getSalary(){
            return salary;
        }
        public void setWorkingHour(byte wHr){
            workingHour=wHr;
        }

        public byte getWorkingHour(){
            return workingHour;
        }
        public void printEmployeeDetails(){
            System.out.println("EmployeeId: "+employeeId);
            System.out.println("EmployeeName: "+employeeName);
            System.out.println("EmployeeSalary: "+salary);
            System.out.println("EmployeeWorkingHour: "+workingHour);

            System.out.println("\n");


        }

    }

    public class Example5{

        public static void main(String[] args) {

            employee eID1 = new employee();
            eID1.printEmployeeDetails();

            eID1.setEmployeeId(101);
            eID1.setEmployeeName("Deepak");
            eID1.setSalary(4800000);
            eID1.setWorkingHour((byte)4);

            eID1.getEmployeeName();
            eID1.getSalary();
            eID1.getEmployeeId();
            eID1.getWorkingHour();
            eID1.printEmployeeDetails();



        }
    }

