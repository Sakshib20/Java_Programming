import java.util.HashMap;

class UniqueChar
{
    public static int firstUniqChar(String s) 
    {
        HashMap<Character, Integer> hmap = new HashMap<>();

        for(int i = 0; i<s.length(); i++)
        {
            if(hmap.containsKey(s.charAt(i)))
            {
                int freq = hmap.get(s.charAt(i));
                freq++;

                hmap.put(s.charAt(i), freq);
            }
            else
            {
                hmap.put(s.charAt(i),1);
            }
            
        }

        for(int i = 0; i<s.length(); i++)
        {
            if(hmap.get(s.charAt(i))==1)
            {
                return i;
            }
        }

        return -1;
    }

    public static void main(String [] A)
    {
        String sobj = "aaple";

        int iRet = firstUniqChar(sobj);

        System.out.println("The 1st unique character is at index : "+iRet);
    }
}