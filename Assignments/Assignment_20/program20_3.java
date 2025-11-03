class Logic
{
    void checkPerfect(int iNo)
    {
        int iCnt=0;
        int iSum=0;

        for(iCnt=1;iCnt<=(iNo/2);iCnt++)
        {
            if(iNo%iCnt==0)
            {
                iSum=iSum+iCnt;
            }
        }

        if(iSum==iNo)
        {
            System.out.println("Perfect number");
        }
        else
        {
            
            System.out.println("Not Perfect number");
        }
        }
    }

// Time Complexity : O(N/2)

class program20_3
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.checkPerfect(6);
        
    }
}