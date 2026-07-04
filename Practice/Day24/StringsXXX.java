import java.util.Scanner;

public class StringsXXX
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your email : ");

        String s = sobj.nextLine();

        String userName = "";


        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)=='@')
            {
                break;
            }
            else
            {
                userName+=s.charAt(i);
            }
        }

        System.out.println(userName);
        sobj.close();
    }
}