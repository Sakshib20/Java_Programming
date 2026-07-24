import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Try {

    public static void main(String[] args) {

        String str= "Application";
        str= str.toLowerCase();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        char[] charr=str.toCharArray();

        for(int i=0;i<charr.length;i++)
        {
            map.put(charr[i], map.getOrDefault(charr[i],0)+1);
        }

        for (Entry<Character,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        
    }

    
}
