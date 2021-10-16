import java.util.Scanner;
public class ArrMultipl {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][]  multi = new int[2][2];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Enter the value of 1st array : ");
                a[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Enter the value of 2nd array : ");
                b[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("Multiplication");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                multi[i][j]=0;
                for(int k=0;k<2;k++){
                multi[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(multi[i][j]+"  ");
            }
            System.out.println(" ");
        }
        input.close();
    }
}
