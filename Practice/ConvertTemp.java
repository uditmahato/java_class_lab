import java.util.Scanner;
public class ConvertTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in F : ");
        int f=input.nextInt();
        int result= ((f-32)*5)/9;
        System.out.println("The given temperature in degree celsius is "+ result );
        if(result <=10){
            System.out.println("Currently ,it is Cold Climate");
        }
        else if (result<=25){
            System.out.println("Currently ,it is Normal Climate");
        }
        else{
            System.out.println("Currently ,it is Very Hot Climate");
        }
        input.close();
    }
}
