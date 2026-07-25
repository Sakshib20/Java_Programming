
public class Tower 
{
    public static void towerOfHanoi(int no, String src, String helper, String dest)
    {
        if(no == 1)
        {
            System.out.println("Transfering disc "+no+ " from " +src+ " to "+dest);
            return;
        }
        towerOfHanoi(no-1,src,dest,helper);
        System.out.println("Transfering disc "+no+ " from " +src+ " to "+dest);
        towerOfHanoi(no-1,helper,src,dest);
    }
    public static void main(String [] A)
    {
        towerOfHanoi(3,"S","H","D");
    }
}
