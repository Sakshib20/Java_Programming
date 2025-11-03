class Logic
{
    void printDivisibleBy2and3(int iNo)
    {
        int iCnt=0;

        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            if(iCnt%2==0 && iCnt%3==0)
            {
                System.out.println(iCnt);
            }
        }
    }
    
}

// Time Complexity : O(N)

class program21_5
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.printDivisibleBy2and3(30);
    }
}