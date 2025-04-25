import java.lang.reflect.Array;
import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {

        // Constructors
        String sData1 =  new String();
        String sData2 = "";

        String sPhrase = "CODE WITH S2P";
        String sCourse = new String("JAVA IS EASY IF WE PRACTICE DAILY");

        char chars [] = {'A','B','C','D'};
        String sAlphabets = new String(chars);

        int [] buffer = {65,75,65,77};
        System.out.println(sData1);
        System.out.println(sData2);

        System.out.println(sPhrase);
        System.out.println(sCourse);

        System.out.println(sAlphabets);
        System.out.println(Arrays.toString( buffer));

    }
}