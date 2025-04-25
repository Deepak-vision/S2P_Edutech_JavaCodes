package operators;

public class example1ex {
    public static void main(String[] args) {
        int a = 0b1010; // a=10
        int b = 0b0110;  // b=6

        int z;
        System.out.println("perform bitwise operations:");
        z = a & b;
        System.out.println("a & b :"+z);
        z = a | b;
        System.out.println("a | b :"+z);
        z = a^b;
        System.out.println("a ^ b :"+z);

       a = -0b1010;
        System.out.println("result:"+a);

        int x =100;

        System.out.println("bit pattern:" +Integer.toBinaryString(x));
        System.out.println("Bit pattern :"+ Integer.toBinaryString(~x));
        x = x>>1;
        System.out.println("result:"+x);
        x = x<<1;
        System.out.println("result:"+ x);


        if (x>=0)
        {
            System.out.println(" 7 bit is active");
        }
        else
        {
            System.out.println("7 bit is not active");
        }


    }
}
