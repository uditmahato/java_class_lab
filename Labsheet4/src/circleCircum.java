/*6.
Write a class Circle with a parameterized constructor. If no parameters are passed then its default constructor should be invoke parameterized constructor with default values. A
circle is defined using radius and circumference.
*/
import java.lang.Math.*;
class Circle{
    double radius;
    double circumference;
    Circle(){
        radius=7.98;
        System.out.println("Default Radius Value : "+radius+"\n"+"Circumference taking default radius value : "+2*Math.PI*radius);
    }
    Circle(double r){
        radius=r;
        System.out.println("Given Radius Value : "+radius+"\n"+"Circumference taking given radius value : "+2*Math.PI*radius);
    }
}
public class circleCircum {
    public static void main(String[] args) {
    Circle s1=new Circle();
    Circle s2=new Circle(198.7);
    }
}
