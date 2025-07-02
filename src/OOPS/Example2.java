package OOPS;

class Course{
    String title;
    String description;
    String duration;
    int price;
    String teacherName;

    // Assign Getter & Setters

    public void setTitle(String Title){
        title=Title;
    }
    public String getTitle(){
        return title;
    }
    public void setDescription(String Description){
        description =Description;
    }
    public String getDescription(){
        return description;
    }
    public void setDuration(String Dur){
        duration=Dur;
    }
    public String getDuration(){
        return duration;
    }
    public void setPrice(int paise){
        price=paise;

    }
    public int getPrice(){
        return price;
    }

    public void setTeacherName(String teacherKaNam){
        teacherName=teacherKaNam;
    }
    public String getTeacherName() {
        return teacherName;
    }

    public  void  printCourseDetails(){
        System.out.println("Title:"+title);
        System.out.println("Description :"+description);
        System.out.println("Duration :"+duration);
        System.out.println("Price:"+price);
        System.out.println("TeacherName :"+teacherName);
        System.out.println("\n");
    }
}
public class Example2 {
    public static void main(String[] args) {

        Course C1 = new Course();
        C1.printCourseDetails();
        C1.setTitle("Web Development");
        C1.setDescription("Full Stack");
        C1.setDuration("5 Hours");
        C1.setPrice(20000);
        C1.setTeacherName("Pranay Ramteke");


        C1.getTitle();
        C1.getDescription();
        C1.getDuration();
        C1.getPrice();
        C1.getTeacherName();
        C1.printCourseDetails();
    }
}
