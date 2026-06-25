
class StringRev
{
    public static void main(String A[])
    {
        String s = "Sakshi";
        System.out.println("String before reverse : "+s);

        char tCh ;
      
        char temp[] = s.toCharArray();

        int j = (temp.length)-1;

        for(int i = 0; i<j; i++, j--)
        {
            tCh = temp[i];
            temp[i] = temp[j];
            temp[j] = tCh;
        }


        String nStr = new String(temp);

        System.out.println("String after reverse : "+nStr);

        
    }
}