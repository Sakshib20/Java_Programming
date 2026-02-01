import java.util.*;
import java.io.*;

///////////////////////////////////////////////////////////
//
//  Function Name : CreateFile
//  Description : It creates new file if it does not exists
//  Input : String
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 01/02/2026
//
///////////////////////////////////////////////////////////
class FileX
{
    public void CreateFile(String FileName)throws Exception
    {
        File fobj = null;
        fobj = new File(FileName);

        if( fobj.exists())
        {
            System.out.println("File Already exists");
        }

        else
        {
            fobj.createNewFile();
            System.out.println("File Created Successfully");
        }
    }
}
class program56_4
{
    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        FileX cobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file :");
        FileName = sobj.nextLine();

        cobj = new FileX();
        cobj.CreateFile(FileName); 

        sobj.close();
    }
}
     