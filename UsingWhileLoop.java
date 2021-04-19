import java.util.Scanner;
public class UsingWhileLoop<TakeInput> {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number  upto which you want to print : ");
    int TakeInput= input.nextInt();
    int y = 1;
    while(y<=TakeInput){
        while(y%2){
            System.out.println(y);
            y++;
        }
    }
}
