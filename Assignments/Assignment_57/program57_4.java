package Assignments.Assignment_57;

import java.io.*;
import java.security.MessageDigest;
import java.util.*;
///////////////////////////////////////////////////////////////////
//
//  Function Name : CalCheckSum
//  Description : It accepts file name from user calculates 
//                checksum of that file and display on screen
//  Input : String
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 01/02/2026
//
///////////////////////////////////////////////////////////////////
class FileX
{
    public void Display(String fName) throws Exception
    {
        File fobj = new File(fName);

        if((fobj.exists())&&(fobj.isFile()))
        {
            MessageDigest mobj = MessageDigest.getInstance("MD5");

            String checksum = Checksum(mobj,fobj);
            System.out.println("CheckSum of "+fName+" is :"+checksum);

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
    private static String Checksum(MessageDigest digest, File fName) throws Exception
    {
        FileInputStream fiobj = new FileInputStream(fName);

        byte[] bArray = new byte[1024];
        int byteCnt = 0;
        
        while((byteCnt=fiobj.read(bArray)) != -1)
        {
            digest.update(bArray,0,byteCnt); 
        }
        fiobj.close();

        byte[] bytes = digest.digest();

        StringBuilder sb = new StringBuilder();
      
        // loop through the bytes array
        for (int i = 0; i < bytes.length; i++) 
        {
          
            // the following line converts the decimal into hexadecimal format and appends that to the StringBuilder object
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }
}
public class program57_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String FileName = null;

        System.out.println("Enter name of file : ");
        FileName = sobj.nextLine();

        FileX cobj = new FileX();

        try
        {
            cobj.Display(FileName);
        }
        catch (Exception eobj)
        {
            System.out.println("Execption Occured");
        }
        

        sobj.close();
    }
}
