
public class SelectionSort 
{
    public static void main(String [] A)
    {
        int [] Arr = {7,8,3,1,2};

        System.out.println("Before sorting : ");

        for(int i = 0; i<Arr.length; i++)
        {
            System.out.print(Arr[i]+"\t");
        }

        for(int i = 0; i<Arr.length-1; i++)
        {
            int smallest = i;

            for(int j = i+1; j<Arr.length; j++)
            {
                if(Arr[smallest]>Arr[j])
                {
                    smallest = j;
                }
            }

            int temp = Arr[smallest];
                Arr[smallest] = Arr[i];
                Arr[i] = temp;
        }

        

        System.out.println("\nAfter sorting : ");

        for(int i = 0; i<Arr.length; i++)
        {
            System.out.print(Arr[i]+"\t");
        }
    }
}
