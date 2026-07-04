import java.util.Scanner;

public class StringB_2
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your email : ");

        StringBuilder sb = new StringBuilder(sobj.next());

        StringBuilder userName = new StringBuilder();

        for(int i = 0; i<sb.length(); i++)
        {
            if(sb.charAt(i) == '@')
            {
                break;
            }
            
            userName.append(sb.charAt(i));
            
        }
        sobj.close();

        System.out.println(userName);
    }
}