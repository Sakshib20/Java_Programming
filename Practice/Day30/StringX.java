// first and last index of occurence

public class StringX
{
    public static void main(String [] A)
    {
        String str = "aeionah";   // first index = 0 , last index = 3

        int first = -1;
        int last = -1;

        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i)=='a')
            {
                if(first==-1)
                {
                    first = i;
                    
                }
                else
                {
                    last = i;
                }
            }
        }

        System.out.println("a if first occured at : "+(first+1)+" and last occured at : "+(last+1));
    }
}
