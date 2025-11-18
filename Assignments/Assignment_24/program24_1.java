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
//  Function Name : Maximum
//  Description : Returns largest number
//  Input : Void
//  Output : Integer
//  Author : Sakshi Pradeep Bhapkar
//  Date : 18/11/2025
//
///////////////////////////////////////////////////////////

    public int Maximum()
    {
        int i=0, iMax=Arr[0];

        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i]>iMax)
            {
                iMax=Arr[i];
            }
        }

        return iMax;
    }
}

class program24_1
{
    public static void main( String A[])
    {
        int iSize=0, iRet;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        iSize=sobj.nextInt();

        ArrayX aobj=new ArrayX(iSize);
        aobj.Accept();
        
        iRet=aobj.Maximum();
        System.out.println("Largest Number is :  "+iRet);
    }
}