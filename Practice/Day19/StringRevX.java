import java.util.Scanner;

class StringRevX
{
    public static String strRev(String s)
    {
        if(s == null)
        {
            return null;
        }

        char[] temp = s.toCharArray();
        int j = (temp.length) - 1;

        for(int i = 0;i<j; i++, j--)
        {
            char ch = temp[i];
            temp[i] = temp[j];
            temp[j] = ch;
        }

        String newStr = new String(temp);

        return newStr;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String s = sobj.nextLine();

        String sRet = null;

        sRet = strRev(s);
        
        System.out.println("String before : "+s);
        System.out.println("String After reverse : "+sRet);
    }
}