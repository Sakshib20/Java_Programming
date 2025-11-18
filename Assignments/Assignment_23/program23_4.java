import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize;
    private int iStart, iEnd;

    public ArrayX(int no)
    {
        iSize=no;
        Arr = new int[iSize];
        
    }

///////////////////////////////////////////////////////////
//
//  Function Name : Accept
//  Description : It accepts N numbers and a start range number and end range number
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

        System.out.println("Enter Range Start : ");
        iStart=sobj.nextInt();

        System.out.println("Enter Range End : ");
        iEnd=sobj.nextInt();

    }

///////////////////////////////////////////////////////////
//
//  Function Name : Range
//  Description : Displays the elements from user defined range 
//  Input : Void
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 18/11/2025
//
///////////////////////////////////////////////////////////

    public void Range()
    {
        int i=0;

        for(i=0;i<Arr.length;i++)
        {
           if(Arr[i]>=iStart && Arr[i]<=iEnd)
           {    
               System.out.println(Arr[i]); 
           }
        }
    }
}

class program23_4
{
    public static void main( String A[])
    {
        int iSize=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        iSize=sobj.nextInt();

        ArrayX aobj=new ArrayX(iSize);
        aobj.Accept();

        System.out.println("ELements within specified range are :");
        aobj.Range();        
    }
}