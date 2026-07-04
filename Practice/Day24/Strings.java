import java.util.Scanner;

public class Strings
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter array size : ");
        int size = sobj.nextInt();

        String [] sArr = new String[size];

        System.out.println("Enter strings ");

        for(int i = 0; i<size; i++)
        {
            sArr[i]=sobj.next();
        }

        int totalLen = 0;

        for(int i = 0; i<size; i++)
        {
            totalLen = totalLen + sArr[i].length();
        }

        System.out.println("Total cummulative Length is : "+totalLen);
        sobj.close();
    }
}