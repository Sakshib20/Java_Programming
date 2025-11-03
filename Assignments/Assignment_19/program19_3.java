class Logic
{
    void checkDivisible(int iNo)
    {
        if(iNo%5==0 && iNo%11==0)
        {
            System.out.println("Yes Divisible by 5 and 11");
        }
        else
        {
             System.out.println("Not Divisible by 5 and 11");
        }
    }
}

class program19_3
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.checkDivisible(55);
        
    }
}