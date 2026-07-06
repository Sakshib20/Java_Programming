// setting bit

public class Bits_1
{
    public static void main(String [] a)
    {
        int no = 5; 
        int pos = 1;

        int mask = 1<<pos;

        int newNo = no | mask;

        System.out.println(newNo);
    }
}
