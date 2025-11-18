import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize;
    private int iNo;

    public ArrayX(int no)
    {
        iSize=no;
        Arr = new int[iSize];
        
    }

///////////////////////////////////////////////////////////
//
//  Function Name : Accept
//  Description : It accepts N numbers and one another number
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

        System.out.println("Enter element to check : ");
        iNo=sobj.nextInt();

    }

///////////////////////////////////////////////////////////
//
//  Function Name : FirstOcc
//  Description : Returns the index of 1st occurence of user defined number 
//  Input : Void
//  Output : Integer
//  Author : Sakshi Pradeep Bhapkar
//  Date : 18/11/2025
//
///////////////////////////////////////////////////////////

    public int FirstOcc()
    {
        int i=0, iIndex=-1;

        for(i=0;i<Arr.length;i++)
        {
           if(Arr[i]==iNo)
           {
                iIndex=i;
                break;
           }
        }
        return iIndex;
    }
}

class program23_2
{
    public static void main( String A[])
    {
        int iSize=0, iRet=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        iSize=sobj.nextInt();

        ArrayX aobj=new ArrayX(iSize);
        aobj.Accept();
        iRet=aobj.FirstOcc();

        System.out.println("Index is : "+iRet);
        
    }
}