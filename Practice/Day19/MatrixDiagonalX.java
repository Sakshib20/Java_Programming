import java.util.Scanner;

public class MatrixDiagonalX
{
    public static int diagonalSum(int[][] arr)
    {
        if(arr == null || arr.length == 0)
        {
            return 0;
        }

        int sum = 0, row = arr.length;

        for(int i = 0; i<row ; i++)
        {
            sum = sum + arr[i][i];

            int j = row - 1- i;

            if(j != i)
            {
                sum = sum + arr[i][j];
            }
        }

        return sum;
    }

    public static void main(String [] A)
    {
        Scanner sobj = new Scanner(System.in);

        int iRow, iCol;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        int[][] Arr = new int[iRow][iCol];

        System.out.println("Enter elements : ");

        for(int i = 0; i<iRow; i++)
        {
            for(int j = 0; j<iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        int iRet = diagonalSum(Arr);

        System.out.println("Sum : "+iRet);
        sobj.close();
    }
}
