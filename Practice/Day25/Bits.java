// getting bit

public class Bits 
{
    public static void main(String [] a)
    {
        int no = 5; 
        int pos = 2;

        int mask = 1<<pos;

        if((no&mask)==0)
        {
            System.out.println("Bit is 0");
        }
        else
        {
            System.out.println("Bit is 1");
        }
    }
}
