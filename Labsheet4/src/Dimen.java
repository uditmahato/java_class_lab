/*
8.Implement a class called Dimension based on the following information:
Constructors
Dimension(double length, double width, double height)
Dimension(double side)
Methods

double volume() // length*width*height
double area() // 2*(length*width+width*height+height*length)
Make all the instance variables private so that they can be accessed only by the methods defined within the class. Make the methods public. Test your program.
*/
class Dimension{
    private double length;
    private double width;
    private double height;
    private double side;
    Dimension(double l,double w,double h){
        length=l;
        width =w;
        height=h;
    }
    Dimension(double s){
        side=s;
    }
    Dimension(Dimension dim){
        length=4;
        width=25;
        height=50;
    }
    public double volume(){
        double volume = length * width * height;
        return volume;
    }
    public double area(){
        double area=2*(length*width+width*height+height*length);
        return area;
    }
    private double toparea(){
        return(length*height);
    }
    private double facearea(){
        return(length*width);
    }
    private double sidearea(){
        return(width*height);
    }

}
public class Dimen {
    public static void main(String[] args) {
       Dimension d1= new Dimension(25,45,67);
       System.out.println("Volume : "+d1.volume()+"\n"+"Area : "+ d1.area());
    }
}
