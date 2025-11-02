class Logic
{
    public void checkEvenOdd(int iNo)
    {
        if(iNo%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }

// Time Complexity : O(1)
}

class program16_2
{
    public static void main(String args[])
    {
        Logic lObj= new Logic();
        lObj.checkEvenOdd(7);
    }
}