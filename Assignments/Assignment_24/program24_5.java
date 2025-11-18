import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize;

    public ArrayX(int no)
    {
        iSize=no;
        Arr = new int[iSize];
        
    }

///////////////////////////////////////////////////////////
//
//  Function Name : Accept
//  Description : It accepts N numbers 
//  Input : Void
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 18/11/2025
//
///////////////////////////////////////////////////////////

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i=0;

        System.out.println("Enter the elements of Array : ");

        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }

///////////////////////////////////////////////////////////
//
//  Function Name : DigitSum
//  Description : Displays the summation of digits of each number
//  Input : Void
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 18/11/2025
//
///////////////////////////////////////////////////////////

    public void DigitSum()
    {
        int i=0, iNo=0, iDigit=0, iSum=0;

        for(i=0;i<Arr.length;i++)
        {
            iNo=Arr[i];
            while(iNo!=0)
            {
                iDigit=iNo%10;
                
                iSum=iSum+iDigit;

                iNo=iNo/10;
            }
            System.out.println("Summation of digits is :  "+iSum);
            iSum=0;
        }
    }
}

class program24_5
{
    public static void main( String A[])
    {
        int iSize=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        iSize=sobj.nextInt();

        ArrayX aobj=new ArrayX(iSize);
        aobj.Accept();
        aobj.DigitSum();
    }
}