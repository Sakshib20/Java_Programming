class Logic
{
    void displayFactors(int iNo)
    {
        int iCnt=0;

        for(iCnt=1;iCnt<=(iNo/2);iCnt++)
        {
            if(iNo%iCnt==0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

// Time Complexity : O(N/2)

class program21_3
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.displayFactors(12);
    }
}