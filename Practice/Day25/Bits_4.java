import java.util.Scanner;

public class Bits_4 
{
    public static void main(String [] a)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int no = sc.nextInt();

        System.out.println("Enter position");
        int pos = sc.nextInt();

        int mask = 1<<pos;
        int bit;

        if((no&mask) != 0)
        {
            bit = 1;
            System.out.println("Inside if ");
        }
        else
        {
            bit = 0;
        }

        System.out.println("Bit : "+bit);

        int newNo = 0;

        switch(bit)
        {
            case(0):
                newNo = no | mask;
                break;

            case(1):
                newNo = no & ~(mask);
                break;
            default:
                System.out.println("Invalid input");
        }

        System.out.println("Before bit manipulation value : "+no);
        System.out.println("After bit manipulation value : "+newNo);

    }

}
