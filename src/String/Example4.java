package String;

import java.sql.SQLOutput;

public class Example4 {

    public static void main(String[] args) {

        String sData = "Started Jounery With S2P ";
        System.out.println(sData);
        int length = sData.length();
        System.out.println("length of data " + length);

        String toLowerCase = sData.toLowerCase();
        System.out.println(toLowerCase);

        String toUpperCase = sData.toUpperCase();
        System.out.println(toUpperCase);

        String extraSpaces = "     started   ";
        System.out.println("Extra Spaces:" +extraSpaces);

        String sTrimmedData = extraSpaces.trim();
        System.out.println("Trimmed data :" +sTrimmedData);

        String sSubstring = "Substring me data konse place se available karana hai vo batata hai ";
        String sSubstring1 = sSubstring.substring(5,6);
        String SSubstring2 = sSubstring.substring(2);

        int sIndexof1 = sData.indexOf("J");
        System.out.println("Indexof shows Addresss of Data: "+ sIndexof1);

        int sIndexof2 = sData.lastIndexOf("J");
        System.out.println("LastIndexOf shows address Of Data From Right To Left  " + sIndexof2);

        String SReplace = " USing String Function ";
        String Replacedata1 = SReplace.replace('S','s');
        System.out.println( SReplace);
        System.out.println("REPLACED DATA:" +Replacedata1);

        String sStartwise = "coding is Easy if done with discipline ";
        String sStartwise2 = "Coding is Easy if done with discipline ";
        Boolean issame ;
        issame = sStartwise.startsWith("coding ");
        System.out.println("This is Used to check that data starts with same value :" +issame);
        issame = sStartwise.endsWith("disciplpine");
        System.out.println("this checks from right to left :" +issame);

        Boolean issame2;
        issame2 = sStartwise.equalsIgnoreCase(sStartwise2);
        System.out.println("equal ignorecase function :"+issame2);

        String sName = "Java Full Stack Dev S2P";
        char cData = sName.charAt(11);
        System.out.println("Char At Index 11 : " + cData);

        String firstCharacter = "a";
        String secondCharacter = "b";
        int sCompare = firstCharacter.compareTo(secondCharacter);
        System.out.println("Compare the data in variables :"+sCompare);

        String firstCharacter1 = "ABC";
        String secondCharacter1 = "ABf";
        int sCompare2 = firstCharacter1.compareTo(secondCharacter1);
        System.out.println("Compare the data in variables :"+sCompare2);


    }
}