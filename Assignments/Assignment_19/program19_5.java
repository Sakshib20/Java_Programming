class Logic
{
    void calculatePower(int iBase, int iExp)
    {
        int iCnt=0;
        int iAns=1;

        for(iCnt=1;iCnt<=iExp;iCnt++)
        {
            iAns=iAns*iBase;
        }

        System.out.println(iAns);  
    }
}

// Time Complexity : O(N)

class program19_5
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.calculatePower(2,5);
    }
}