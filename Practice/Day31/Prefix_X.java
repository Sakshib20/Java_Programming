public class Prefix_X 
{
    public static void longestPrefix(String[] sArr)
    {
        int len = sArr[0].length(), size = sArr[0].length();

        for(int i = 1;i<sArr.length;i++)
        {
            if(len<size)
            {
                size = len;
            }

            if(sArr[i-1].length()<sArr[i].length())
            {
                len = sArr[i].length();
            }
            else
            { 
                len = sArr[i].length();
            }

        }

        String prefix = new String(sArr[0]);
        StringBuffer buffer = new StringBuffer();

        for(int i = 1; i<sArr.length; i++)
        {
            for(int j = 0; j<len; j++)
            {
                if(prefix.charAt(j)==sArr[i].charAt(j))
                {
                    buffer.insert(j,prefix.charAt(j));
                }
                else
                {
                    break;
                }
            }
            len = buffer.length();
            prefix = buffer.toString();
            buffer.delete(0,buffer.length());
        }

        System.out.println("Longest prefix string is : "+prefix);


    }

    public static void main(String[]A)
    {
        String[] Arr = {"flight","flower","flow"};

        longestPrefix(Arr);

    }
    
}
