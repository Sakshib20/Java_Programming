package Assignments.Assignment_57;

import java.util.*;
import java.io.*;

///////////////////////////////////////////////////////////////////
//
//  Function Name : CreateDir
//  Description : Creates new Directory
//  Input : String
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 01/02/2026
//
///////////////////////////////////////////////////////////////////

class FileX
{
    public void CreateDir(String DirectoryName)
    {
        File fobj = new File(DirectoryName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Directory already present");
        }
        else
        {
            fobj.mkdir();
            System.out.println("Directory created successfully");
        }

    }
}
public class program57_3 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String DName = null;

        System.out.println("Enter name of directory you want to create : ");    
        DName = sobj.nextLine();

        FileX cobj = new FileX();

        cobj.CreateDir(DName);

        sobj.close();
        
    }
}
