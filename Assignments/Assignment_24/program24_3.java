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
//  Description : Returns the difference between largest and smallest number
//  Input : Void
//  Output : Integer
//  Author : Sakshi Pradeep Bhapkar
//  Date : 18/11/2025
//
///////////////////////////////////////////////////////////

    public int Difference()
    {
        int i=0, iMin=Arr[0], iMax=Arr[0];

        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i]<iMin)
            {
                iMin=Arr[i];
            }
            if(Arr[i]>iMax)
            {
                iMax=Arr[i];
            }
        }

        return iMax-iMin;
    }
}

class program24_3
{
    public static void main( String A[])
    {
        int iSize=0, iRet;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        iSize=sobj.nextInt();

        ArrayX aobj=new ArrayX(iSize);
        aobj.Accept();
        
        iRet=aobj.Difference();
        System.out.println("Difference between largest and Smallest Number is :  "+iRet);
    }
}