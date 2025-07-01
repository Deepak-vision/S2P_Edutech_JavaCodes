package OOPS;
// Array Of Objects
class StudentData{
    int age;
    String name;

    public StudentData(){
        age=18;
        name = "pawan";

    }
    public StudentData(int age,String name){
        System.out.println("Age :"+age);
        System.out.println("Name :"+name);

    }
     void PrintData(){

        System.out.println("Age :"+age);
        System.out.println("Name :"+name);

    }


}
public class Example7 {
    public static void main(String[] args) {
        StudentData[] studs = new StudentData[4];
        studs[0] = new StudentData(20,"deepak");
        studs[1] = new StudentData();
        studs[2] = new StudentData(19,"ram");
        studs[3] = new StudentData();

        System.out.println(studs[2].name);
        System.out.println(studs[3]);
    }
}
