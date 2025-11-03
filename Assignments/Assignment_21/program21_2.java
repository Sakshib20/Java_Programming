class Logic
{
    void countEvenOddRange(int iNo)
    {
        int iCnt=0;
        int iEcnt=0;
        int iOcnt=0;

        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            if(iCnt%2==0)
            {
                iEcnt++;
            }
            else
            {
                iOcnt++;
            }
        }

        System.out.println("Even numbers between 1 to "+iNo+" are : "+iEcnt);
        System.out.println("Odd numbers between 1 to "+iNo+" are : "+iOcnt);
    }
}

// Time Complexity : O(N)

class program21_2
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.countEvenOddRange(50);
    }
}