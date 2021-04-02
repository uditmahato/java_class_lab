import java.util.Scanner;
public class ScannerDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        float weight=sc.nextInt();
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);

    }
}
