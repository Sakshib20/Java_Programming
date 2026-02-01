package Assignments.Assignment_57;

import java.util.*;
import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : DisplayFiles
//  Description : It accepts directory name from user and displays all files and size of each file from that directory
//  Input : String
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 01/02/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class FileX
{
    public void DisplayFiles(String DirectoryName)throws Exception
    {
        File fobj = new File(DirectoryName);

        if((fobj.exists())&&(fobj.isDirectory()))
        {
            System.out.println("Folder is present");

            File fArr[]=fobj.listFiles();
            System.out.println("Total number of files in the folder are : "+fArr.length);

            for(int i = 0; i<fArr.length; i++)
            {
                System.out.println("File name : "+fArr[i].getName()+" "+fArr[i].length()+" bytes");
            }
        }
        else
        {
            System.out.println("There is no such directory");
        }
    }
}
class program57_5
{
    public static void main(String A[]) throws Exception
    {
        String DName = null;
        FileX cobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of Directory :");
        DName = sobj.nextLine();

        cobj = new FileX();
        cobj.DisplayFiles(DName); 

        sobj.close();
    }
}
     
