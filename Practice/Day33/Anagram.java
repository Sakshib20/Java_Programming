// checking if 2 strings are anagram

import java.util.HashMap;

public class Anagram {

    public static boolean checkAnagram(String s1, String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }

        HashMap<Character,Integer> hmap = new HashMap<>();

        for(char ch = 'a'; ch<='z';ch++)
        {
            hmap.put(ch,0);
        }

        for(int i = 0; i<s1.length(); i++)
        {
            hmap.put(s1.charAt(i),1);

        }

        for(int i = 0; i<s2.length(); i++)
        {
            if(hmap.containsKey(s2.charAt(i)))
            {
                hmap.put(s2.charAt(i),hmap.get(s2.charAt(i))-1);
            }

            else
            {
                hmap.put(s2.charAt(i),1);
            }
        }

        for(Character keys : hmap.keySet())
        {
            if(hmap.get(keys)!=0)
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] A)
    {
        String s1 = "silent";
        String s2 = "apple";

        boolean Ret = checkAnagram(s1,s2);
        
        if(Ret)
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are NOT anagram");
        }

        
    }

    
}
