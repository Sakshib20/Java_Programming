class Logic
{
    void printReverse(int iNo)
    {
        int iCnt=0;

        for(iCnt=iNo;iCnt>=1;iCnt--)
        {
            System.out.println(iCnt);   
        }
    }
}

// Time Complexity : O(N)

class program20_2
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.printReverse(10);
    }
}