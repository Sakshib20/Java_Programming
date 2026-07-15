
public class BubbleSort 
{
    public static void main(String [] A)
    {
        int [] Arr = {7,8,3,2,1};

        System.out.println("Before sorting : ");

        for(int i = 0; i<Arr.length; i++)
        {
            System.out.print(Arr[i]+"\t");
        }

        for(int j = 0; j<Arr.length-1; j++)
        {
            for(int i = 0; i<Arr.length-1-j; i++)
            {
                int temp = 0;

                if(Arr[i]>Arr[i+1])
                {
                    temp = Arr[i];
                    Arr[i] = Arr[i+1];
                    Arr[i+1] = temp;
                }
            } 

        }

        System.out.println("\nAfter sorting : ");

        for(int i = 0; i<Arr.length; i++)
        {
            System.out.print(Arr[i]+"\t");
        }
    }
}
