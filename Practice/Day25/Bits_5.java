import java.util.Scanner;
// checking if a number is power of 2 or not
public class Bits_5 
{
    public static void main(String [] a)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int no = sc.nextInt();

        if((no & (no-1)) == 0)
        {
            System.out.println(no+" is power of 2");
        }
        else
        {
            System.out.println(no+" is not power of 2");
        }

    }

}
