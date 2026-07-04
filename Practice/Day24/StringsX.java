import java.util.Scanner;

public class StringsX
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");

        String s = sobj.nextLine();

        String result = "";

        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch == 'e')
            {
                result = result + 'i';
            }
            else
            {
                result = result + ch;
            }
        }

        System.out.println("String is : "+result);
        sobj.close();
    }
}