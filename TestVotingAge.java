import java.util.Scanner;
public class TestVotingAge {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your age :");
        int age= sc.nextInt();
        if(age>=18 && age<120){
            System.out.println("Hello Udit,You are eligible to Vote");
        }
        else if( age>18 && age>120){
            System.out.println("Invalid Age");
        }
        else{
            System.out.println("Sorry sishir,You are not eligible to Vote");
        }
        sc.close();

    }
}
