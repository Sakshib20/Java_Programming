//WAP to find best time to buy stock

public class Stock {

    public static int buyStock(int[] Arr)
    {
        int min = Integer.MAX_VALUE;
        int day = 0;
        
        for(int i = 0; i<Arr.length; i++)
        {
            if(Arr[i]<min)
            {
                min = Arr[i];
                day = i;
            }
        }

        return day+1;
        
    } 

   public static void main(String[] A)
    {
        int[] Arr = {4,5,6,1,4,8};

        System.out.println("Best time to buy stock is on Day "+Stock.buyStock(Arr));
    }
    
}
