class Logic
{
    void countFactors(int iNo)
    {
        int iCnt=0;
        int iFreq=0;

        for(iCnt=1;iCnt<=(iNo/2);iCnt++)
        {
            if(iNo%iCnt==0)
            {
                iFreq++;
            }
        }

        System.out.println(iFreq);
    }
}

// Time Complexity : O(N/2)

class program21_4
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.countFactors(12);
    }
}