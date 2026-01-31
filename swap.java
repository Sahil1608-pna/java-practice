public class swap 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        int c = a;  // store a in c
        a = b;         // put b into a
        b = c;      // put old a (c) into b

        System.out.println("After swap:  a = " + a + ", b = " + b);
    }
}
