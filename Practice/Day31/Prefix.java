// finding the common prefix in all strings
class Prefix
{
    public static void main(String[] A)
    {
        String [] Arr = {"flower","flow","flight","fly"};
        int len = Arr[0].length();
        int size = Integer.MAX_VALUE;

        for(int i = 1;i<Arr.length;i++)
        {
            if(len<size)
            {
                size = len;
            }
            if(Arr[i-1].length()<Arr[i].length())
            {
                len = Arr[i-1].length();
            }
            else
            {
                len = Arr[i].length();
            }
        }
        len = size;

        String prefix = new String(Arr[0]);
        StringBuffer buffer = new StringBuffer();

        for(int i = 1;i<Arr.length;i++)
        {
            for(int j = 0; j<len; j++)
            {
                if(prefix.charAt(j)==Arr[i].charAt(j))
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

        System.out.println(prefix);

        
    }
}