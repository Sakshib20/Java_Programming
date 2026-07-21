// demo code for recursion print number in reverse order

public class Recursion_1 
{
    public static void printNum(int num)
    {

        if(num == 0)
        {
            return;
        }

        System.out.println(num);
        printNum(num-1);
    }

    public static void main(String [] A)
    {
        int iNo = 5;
        printNum(iNo);
    }
}
