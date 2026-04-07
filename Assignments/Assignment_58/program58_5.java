package Assignments.Assignment_58;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : CopyContent
//  Description : It accepts directory name from user and write data of all files along with file Name  and size
//                into one newly created file Marvellous.txt
//  Input : String
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 06/04/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class File_X
{
    public void CopyContent(String dName) throws Exception
    {
        File fobj = new File(dName);

        if(fobj.exists() && fobj.isDirectory())
        {
            byte Buffer[] = new byte[1024];
            int iRet = 0;
            FileInputStream fiobj = null;

            File fobj2 = new File("Marvellous.txt");
            fobj2.createNewFile();

            FileOutputStream foobj = new FileOutputStream(fobj2);

            File fArr[] = fobj.listFiles();

            for(int i = 0; i<fArr.length; i++)
            {
                Buffer = fArr[i].getName().getBytes();
                foobj.write(Buffer);

                String size = String.valueOf(fArr[i].length());
                Buffer = size.getBytes();

                foobj.write(Buffer);

                foobj.write(System.lineSeparator().getBytes());

                fiobj = new FileInputStream(fArr[i]);

                
                while ((iRet = fiobj.read(Buffer))!=-1)
                    {
                        foobj.write(Buffer,0,iRet);
                    }
                foobj.write(System.lineSeparator().getBytes());

            }
            fiobj.close();
            foobj.close();
        }

        else
        {
            System.out.println("No such directory found");
            return;
        }
    }
}

public class program58_5 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the name of directory : ");
        String DirectoryName = sobj.nextLine();

        File_X fobj = new File_X();

        try 
        {
            fobj.CopyContent(DirectoryName);
        } 
        catch (Exception e) 
        {
            System.out.println("Exception Occured"+ e);
        }
        sobj.close();
        
    }
}
