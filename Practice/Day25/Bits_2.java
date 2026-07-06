// clearing the bit

public class Bits_2
{
    public static void main(String [] a)
    {
        int no = 5; 
        int pos = 2;

        int mask = 1<<pos;

        int newNo = no & ~mask;

        System.out.println(newNo);
    }
}
