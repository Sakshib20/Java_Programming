import java.util.Scanner;

// input and output 2d array i.e matrix

public class Array2D 
{
    public static void main(String[] A)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of rows : ");
        int row = sc.nextInt();

        System.out.println("Number of columns : ");
        int col = sc.nextInt();

        int [][] mat = new int [row][col];

        System.out.println("Enter elements : ");

        for(int i = 0; i<row; i++)
        {
            for(int j = 0; j<col; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements are : ");

        for(int i = 0; i<row; i++)
        {
            for(int j = 0; j<col; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

}
