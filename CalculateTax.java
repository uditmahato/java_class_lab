import java.util.Scanner;
public class CalculateTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your yearly income : ");
        long income=input.nextLong();
        System.out.println("Your income is Rs" + income);
        if(income<100000){
            double tax = 0;
            System.out.println("You will have to pay Rs " + tax +" because your income is less or equals to 1,00,000");
        }
        else if(income>100000&& income<=150000){
            double tax= 0.1*(income-100000);
            System.out.println("You will have to pay Rs "+ tax +" because your income is greater than 1,00,000 and less or equals to 1,50,000");
        }
        else if(income>150000&& income<=250000){
            double tax = 5000+(0.2*(income-150000));
            System.out.println("You will have to pay Rs "+ tax +" because your income is greater than 1,50,000 and less or equals to 2,50,000");

        }
        else{
            double tax=25000+(0.3*(income-250000));
            System.out.println("You will have to pay Rs "+ tax +" because your income is greater than Rs2,50,000");

        }
        input.close();
    }
}

