import java.util.Scanner;

class Palindrome
{
    public static boolean checkPalin(String s)
    {
        if(s == null)
        {
            return false;
        }

        int j = (s.length()) - 1;

        for(int i = 0; i<j; i++, j--)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String s = sobj.nextLine();

        sobj.close();

        boolean bRet = checkPalin(s);
        
        if(bRet)
        {
            System.out.println("Yes it is Palindrome");
        }
        else
        {
            System.out.println("No it is  Not Palindrome");
        }
    }
}