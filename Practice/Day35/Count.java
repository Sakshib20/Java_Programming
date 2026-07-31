//WAP Count Digits, Alphabets and Special Characters

import java.util.HashMap;

public class Count {

    public static void countDAC(String str)
    {
        HashMap<String,Integer> hmap = new HashMap<>();
        hmap.put("Digit",0);
        hmap.put("Character",0);
        hmap.put("Special Char",0);

        for(int i = 0; i<str.length(); i++)
        {
            int ascVal = (int)str.charAt(i);
            if(ascVal>=48 && ascVal<=57)
            {
                hmap.put("Digit",hmap.get("Digit")+1);
            }
            else if((ascVal>=65 && ascVal<= 90) || (ascVal>=97 && ascVal<= 122))
            {
                hmap.put("Character",hmap.get("Character")+1);
            }
            else
            {
                hmap.put("Special Char",hmap.get("Special Char")+1);
            }

        }

        for(String key : hmap.keySet())
        {
            System.out.println(key +" : "+hmap.get(key));
        }
    }

    public static void main(String[] A)
    {
        Count.countDAC("Hello@123");
    }   
    
}
