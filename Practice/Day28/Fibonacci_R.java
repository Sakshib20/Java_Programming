public class Fibonacci_R 
{
    public static void calFibo(int no1, int no2,int n)
    {
        if(n==0)
        {
            return;
        }
        int no3 = no1+no2;
        System.out.printf(no1+"\t");
        calFibo(no2,no3,n-1);

    }
    public static void main(String [] A)
    {
        calFibo(0,1,5);

    }    
}
