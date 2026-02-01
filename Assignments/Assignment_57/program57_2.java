package Assignments.Assignment_57;

import java.io.*;
import java.util.*;

///////////////////////////////////////////////////////////////////
//
//  Function Name : ChkReg
//  Description : It checks if a file is regular file or not
//  Input : String
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 01/02/2026
//
///////////////////////////////////////////////////////////////////
class FileX
{
    public void ChkReg(String fName)
    {
        File fobj = new File(fName);

        if((fobj.exists())&&(fobj.isFile()))
        {
            System.out.println("It is a regular file");
        }
        else if(! fobj.exists())
        {
            System.out.println("File does not exists");
        }
        else
        {
            System.out.println("File does not exists");
        }
    }
}
public class program57_2 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String FileName = null;

        System.out.println("Enter name of file : ");
        FileName = sobj.nextLine();

        FileX cobj = new FileX();

        cobj.ChkReg(FileName);

        sobj.close();
    }
}
