// reverse the number

public class Recursion_2 
{
    public static void revNum(int num, int newNum)
    {
        if(num==0)
        {
            System.out.println(newNum);
            return;
        }

        newNum = (num%10) + newNum * 10;
        revNum(num/10, newNum);
    }

    public static void main(String [] A)
    {
        int iNo = 256;
        revNum(iNo,0);
    }
}
