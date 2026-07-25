
public class StringR 
{
    public static void strRev(String str, int i)
    {
        if(i==0)
        {
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        strRev(str,i-1);
    }

    public static void main(String[] A)
    {
        String str = "abcd";
        strRev(str,str.length()-1);
    }
}
