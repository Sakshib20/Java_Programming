import java.util.Scanner; 

// binary represe

public class Bits_6 
{
    public static int decimalToBinary(int dNo)
    {
        StringBuilder sbobj = new StringBuilder();
        while(dNo!=0)
        {
            int rem = dNo%2;
            dNo = dNo/2;
            sbobj.append(rem);
        }

        int bNo = Integer.parseInt(sbobj.reverse().toString());

        return bNo;
    }

    public static int binaryToDecimal(int bNo)
    {
        int i = 0;
        int result=0;

        while(bNo != 0)
        {
            int lastdigit = bNo%10;
            result = result + (Math.powExact(2,i) * lastdigit);
            bNo = bNo/10;
            i++;

        }

        return result;
    }

    public static void main(String [] a)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("What you want to do ?\nChoice 1 : Convert Decimal to Binary\nChoice 2 : Convert Binary to Decimal.\n");

        int choice = sc.nextInt();

        System.out.println("Enter the number : ");
        int iNo = sc.nextInt();

        int iRet = 0;

        switch(choice)
        {
            case(1):
            iRet = decimalToBinary(iNo);
            System.out.printf("Binary representation of %d is : %d",iNo,iRet);
            break;

            case(2):
            iRet = binaryToDecimal(iNo);
            System.out.printf("Decimal representation of %d is : %d",iNo,iRet);
            break;

            default:
            System.out.println("Enter Valid input.");
            break;
        }

        sc.close();

    }}