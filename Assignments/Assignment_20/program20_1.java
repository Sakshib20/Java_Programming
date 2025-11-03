class Logic
{
    void sumEvenNumbers(int iNo)
    {
        int iCnt=0;
        int iSum=0;

        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            if(iCnt%2==0)
            {
                iSum=iSum+iCnt;
            }
        }

        System.out.println(iSum);
    }
}

// Time Complexity : O(N)

class program20_1
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.sumEvenNumbers(10);
    }
}