class Logic
{
    void checkSign(int iNo)
    {
        if(iNo>0)
        {
            System.out.println("Number is Positive");
        }
        else if(iNo<0)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is Zero");
        }
    }
        
}

// Time Complexity : O(N)

class program18_5
{
    public static void main(String args[])
    {
        Logic lObj=new Logic();
        lObj.checkSign(1);
        lObj.checkSign(0);
        lObj.checkSign(-8);
        
        
    }
}