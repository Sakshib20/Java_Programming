import java.util.Scanner;

public class StringB_1
{
    public static void main(String [] A)
    {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.nextLine());

        for(int i = 0; i<sb.length(); i++)
        {
            if(sb.charAt(i)=='e')
            {
                sb.setCharAt(i,'i');
            }
        }

        System.out.println(sb);
        sc.close();
    }
}