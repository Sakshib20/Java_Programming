class Logic
{
    void displayGrade(int iMarks)
    {
        if(iMarks>90 && iMarks<100)
        {
            System.out.println("A");
        }
        if(iMarks>80 && iMarks<90)
        {
            System.out.println("B");
        }
        if(iMarks>70 && iMarks<80)
        {
            System.out.println("C");
        }
        if(iMarks<70)
        {
            System.out.println("D");
        }
    }
}

class program19_2
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.displayGrade(82);
    }
}