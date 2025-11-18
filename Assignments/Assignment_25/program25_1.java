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
//  Function Name : Difference
//  Description : Returns difference between summation of even elements and summation of odd elements
//  Input : Void
//  Output : Integer
//  Author : Sakshi Pradeep Bhapkar
//  Date : 18/11/2025
//
///////////////////////////////////////////////////////////

    public int Difference()
    {
        int i=0, iEven=0, iOdd=0;

        for(i=0;i<Arr.length;i++)
        {
            if((Arr[i]%2)==0)
            {
                iEven=iEven+Arr[i];
            }
            if((Arr[i]%2)!=0)
            {
                iOdd=iOdd+Arr[i];
            }
        }

        return iEven-iOdd;
    }
}

class program25_1
{
    public static void main( String A[])
    {
        int iSize=0, iRet=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        iSize=sobj.nextInt();

        ArrayX aobj=new ArrayX(iSize);
        aobj.Accept();

        iRet=aobj.Difference();
        System.out.println("Difference is : "+iRet);
    }
}