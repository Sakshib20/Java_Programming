public class Fibonacci 
{
    public static void calFibo(int no1, int no2,int n)
    {
        System.out.printf(no1+"\t");
        System.out.printf(no2+"\t");

        for(int i = 0; i<n-2; i++)
        {
            int no3 = no1 + no2;
            System.out.printf(no3+"\t");

            no1 = no2;
            no2=no3;
        }
    }
    public static void main(String [] A)
    {
        calFibo(0,1,6);

    }    
}
