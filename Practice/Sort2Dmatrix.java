import java.util.Scanner;
public class Sort2Dmatrix {
    public static void main(String[] args) {
        int row;
        int col;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows you want in the matrix");
        row = input.nextInt();
        System.out.println("Enter the number of column you want in the matrix");
        col = input.nextInt();
        int Numbers[][] = new int[row][col];
        int temp;
        //get input from users
        System.out.println("Enter integer values");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Numbers[i][j] = input.nextInt();
            }
        }
        for (int i = 1; i < row; i++) {
            for (int k = 1; k < col; k++) {
                for (int j = 1; j < col - 1; j++)
                    if (Numbers[i][j] > Numbers[i][j + 1]) {
                        {
                            temp = Numbers[i][j + 1];
                        }
                    }
            }
        }
    }
}
