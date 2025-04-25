// Literal pool Example
public class Example3 {
    public static void main(String[] args) {

        String sData1 = new String("Java");
        String sData2 = "Java";
        String sData3 = "Java";

        boolean isSame = (sData1 == sData2);
        System.out.println("Are They Same : " + isSame);

        isSame = (sData3 == sData2);
        System.out.println("Are They Same : " + isSame);

        // Correct Way To Compare String, by their content
        isSame = sData1.equals(sData2);
        System.out.println("Are They Same " + isSame);

        isSame = (sData2 == sData3);
        System.out.println("are they same " +  isSame);
    }
}
