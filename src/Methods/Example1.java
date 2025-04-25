package Methods;
    public class Example1 {

        public static void printUserProfile(String username , int age, String location,String status,String intrests) {

            System.out.println("User:"+username);
            System.out.println("Age:"+age);
            System.out.println("Location:"+location);
            System.out.println("Status:"+status);
            System.out.println("Interests:"+intrests);
            System.out.println("-----------------------------");
        }
        public static void main(String[] args) {

            printUserProfile("Alice" , 25, "New york","Active","music");
            printUserProfile("Bob" , 30, "London","Active"," Sports, Reading");
            printUserProfile("Charlie" , 28, "Sydney","Active"," Hiking, Gaming");
            printUserProfile("Diana" , 22, "Toronto","Active","Design, Art");

        }
    }
