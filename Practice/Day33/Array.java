// Find first non repeating character in string

import java.util.HashMap;

public class Array{
    public static void main(String[]A)
    {
        String str = new String("application");
        HashMap<Character,Integer> hmap = new HashMap<>();

        for(int i = 0; i<str.length(); i++)
        {
            if(hmap.containsKey(str.charAt(i)))
            {
                hmap.put(str.charAt(i),hmap.get(str.charAt(i))+1);
            }
            else
            {
                hmap.put(str.charAt(i),1);
            }
        }

        for(Character keys : hmap.keySet())
        {
            if(hmap.get(keys)==1)
            {
                System.out.println(" first non repeating character is : "+keys);
                break;
            }
        }

    }
    
}
