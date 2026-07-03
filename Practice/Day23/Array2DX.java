import java.util.Scanner;

// searching element and displaying it's location(index)

public class Array2DX 
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

        System.out.println("Enter the elements to search : ");

        int search = sc.nextInt();

        for(int i = 0; i<row; i++)
        {
            for(int j = 0; j<col; j++)
            {
                if(mat[i][j] == search)
                {
                    System.out.println("Element is at : [ "+i+" ] [ "+j+" ]");
                }
            }
        }
    }

}
