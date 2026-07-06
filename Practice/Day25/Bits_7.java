import java.util.Scanner;

// total number of 1's in binary representation
public class Bits_7 
{
    public static void main(String [] A)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int iNo = sc.nextInt();
        StringBuilder result = new StringBuilder();

        while(iNo!=0)
        {
            int bit = iNo%2;

            result.append(bit);
            iNo = iNo/2;
        }
        result.reverse();

        int sum = 0;

        for(int i = 0; i<result.length(); i++)
        {
            if(result.charAt(i) == '1')
            {
                sum++;
            }
        }

        System.out.println("Total number of 1's are : "+sum);


    }
}
