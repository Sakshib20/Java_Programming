public class Solution {

    public static int countGold(String coins)
    {
        int nb = 0;
        int ns = 0;
        int ng = 0;

        for(char c : coins.toCharArray())
        {
            if(c=='B')
            {
                nb++;
            }
            else if(c=='S')
            {
                ns++;
            }
            else if(c=='G')
            {
                ng++;
            }
        }

        // System.out.println(nb);
        // System.out.println(ns);
        // System.out.println(ng);
        // System.out.println((nb+ns)/9);

        return ng + (3*nb+ns)/9;

        
    }

    public static void main(String []A)
    {
        String str = "SSSBBGBG";
        int Ret = countGold(str);

        System.out.println(Ret+" Total gold coins can be purchased");
    }
    
}
