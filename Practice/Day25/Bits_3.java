import java.util.Scanner;

// updating bit

public class Bits_3 
{
    public static void main(String [] a)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int no = sc.nextInt();

        System.out.println("Enter the position : ");
        int pos = sc.nextInt();

        System.out.println("Enter bit to change to 0 or 1 ?");
        int change = sc.nextInt();

        int mask = 1<<pos;
        int newNo = 0;

        switch(change)
        {
            case(0):
                mask = ~mask;
                newNo = no & mask;
                break;
            
            case(1):
                newNo = no | mask;
                break;
            default:
                System.out.println("Invalid input ");
                break;
        }

        System.out.println("New number after modifying bits is : "+newNo);
    }
}
