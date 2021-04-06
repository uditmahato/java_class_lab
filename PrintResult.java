import java.util.Scanner;
public class PrintResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your  Marks :");
        int marks = sc.nextInt();
        sc.close();
        if(marks<=100) {
            if(marks<=100 && marks>80){
                System.out.println("Congrats You have passed with First Class");
            }
            else if(marks<=80 && marks>50){
                System.out.println("Congrats You have passed with Second Class");
            }else if(marks<=50 && marks>40){
                System.out.println("Congrats You have been passed with Third Class");
            }else{
                System.out.println("Unfortunately You have failed this time");
                }
            }
        else {
            System.out.println("You duffer,why are you trying invalid mark");
        }
    }
}
