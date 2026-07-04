import java.util.Scanner;

public class StringsXX
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your email : ");

        String s = sobj.nextLine();

        int len = -1;

        for(int i = 0; i<s.length(); i++)
        {
            len++;
            if(s.charAt(i)=='@')
            {
                break;
            }
        }

        String userName = s.substring(0,len);


        System.out.println(userName);
        sobj.close();
    }
}