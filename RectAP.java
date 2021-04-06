import java.util.Scanner;
public class RectAP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        int length=sc.nextInt();
        System.out.println("Enter the width of rectangle: ");
        int width=sc.nextInt();
        int area= length*width;
        int sum=length+width;
        int perimeter= 2*sum;
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The area of the perimeter is " + perimeter);

    }
}
