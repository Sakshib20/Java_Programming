
public class Shift 
{
    public static void main(String[] A)
    {
        String str = "axbxca";
        String s = "";

        int count = 0;

        for(int i = 0; i<str.length();i++)
        {
            if(str.charAt(i)=='x')
            {
                count++;
            }
            else
            {
                s = s+str.charAt(i);
            }
        }

        for(int i = 0; i<count; i++)
        {
            s = s+'x';
        }

        System.out.println(s);
    }    
}
