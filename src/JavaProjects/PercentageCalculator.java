package JavaProjects;
import java.util.Scanner;
public class PercentageCalculator {

        public static void main(String[] args) {
            int Maxmarks =500;
            Scanner sh = new Scanner(System.in);

            System.out.println("convert total marks into percentage:");
            System.out.print("Enter marks in maths:");
            float maths = sh.nextFloat();
            System.out.print("Enter marks in hindi:");
            float hindi = sh.nextFloat();
            System.out.print("Enter marks in english:");
            float english =sh.nextFloat();
            System.out.print("Enter marks in social science:");
            float socialscience =sh.nextFloat();
            System.out.print("Enter marks in science:");
            float science =sh.nextFloat();
            System.out.print("sum of total marks in all subjects obtained:");
            float marksobtained = maths+hindi+english+socialscience+science;
            System.out.println(marksobtained);
            // now lets convert marks into percentage;
            System.out.print("Converting marks into percentage:" );

            float percentageofstudent = (marksobtained/Maxmarks)* 100;

            System.out.print(percentageofstudent+"%");


        }
    }
