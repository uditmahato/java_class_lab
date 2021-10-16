import java.util.Scanner;
class Data{
    String name;
    double accountnum;
    String type;
    double amount;
    double depositemoney;
    double withdraw;

    void Data(String name,double accountnum, String type, double amount){
        this.name= name;
        this.accountnum =accountnum;
        this.type    = type;
        this.amount= amount;
    }
    void deposite(double depositemoney){
        this.depositemoney = depositemoney;
        double newmoney = this.amount+this.depositemoney;
        System.out.println(newmoney);
        this.amount =newmoney;
        System.out.println("your new balance is"+ ""+ newmoney);
    }

    void withdraw(){

        double newmoneys =this.amount-withdraw;
        this.amount = newmoneys;
        System.out.println("your new amount "+newmoneys);

    }
    void details(){
        System.out.println("account holder name is:" + this.name);
        System.out.println("");
        System.out.println("your account type:"+ this.type);
        System.out.println("");
        System.out.println("your current money:"+this.amount);
        System.out.println("");

    }

}

public class bankAcc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Data obj = new Data();

        obj.name ="Sagar";
        obj.accountnum=123;
        obj.type ="saving";
        obj.amount = 5000;

        System.out.println("enter your pin number");
        int pin =sc.nextInt();

        if (pin==123){
            char choice;
            do{
                while(true)
                {
                    System.out.println("Automated Teller Machine");
                    System.out.println("Choose 1 for Withdraw");
                    System.out.println("Choose 2 for Deposit");
                    System.out.println("Choose 3 for Check Balance");
                    System.out.println("choose 4 details");
                    System.out.println("Choose 5 for EXIT");
                    System.out.print("Choose the operation you want to perform:");
                    int n = sc.nextInt();
                    switch(n)
                    {

                        case 1:
                            if (obj.amount>=obj.withdraw){
                                System.out.println("enter the anount you want to withdraw");
                                obj.withdraw = sc.nextDouble();
                                obj.withdraw();


                            }
                            else{
                                System.out.println("low balance");

                            }
                            break;
                        case 2:
                            System.out.println("enter the money you want to deposite");
                            obj.depositemoney = sc.nextDouble();
                            obj.deposite(obj.depositemoney);
                            break;

                        case 3:
                            System.out.println("your balane is"+obj.amount);
                            System.out.println("");

                            break;

                        case 4:
                            System.out.println("your details is");
                            obj.details();
                            break;

                        case 5:
                            System.exit(0);

                    }
                    System.out.println("do you want to continue(y/N)");
                    choice =sc.next().charAt(0);
                }


            }while(choice=='y'||choice =='Y');

        }


        else{
            System.out.println("sorry");
        }
    }
}