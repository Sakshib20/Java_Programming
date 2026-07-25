import java.util.Scanner;

public class ShiftX 
{
    public static String shiftToEnd(String str,Character ch)
    {
        String newStr = "";

        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i)!= ch)
            {
                newStr+=str.charAt(i);
            }
        }

        for(int i = newStr.length();i<str.length();i++)
        {
            newStr+=ch;
        }

        return newStr;
    }

    public static void main(String[] A)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");

        String str = sc.next();
        String Ret = shiftToEnd(str,'x');

        System.out.println(Ret);
    }   
}
