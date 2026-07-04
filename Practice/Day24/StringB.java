import java.util.Scanner;

public class StringB
{
    public static void main(String [] A)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size : ");
        int size = sc.nextInt();

        StringBuilder [] sbArr = new StringBuilder[size];

        for(int i = 0; i<size; i++)
        {
            sbArr[i] = new StringBuilder(sc.next());
        }

        int totalLen = 0;

        for(int i = 0; i<size; i++)
        {
           totalLen += sbArr[i].length();
        }

        System.out.println("Total cummulative size is : "+totalLen);
        sc.close();
    }
}