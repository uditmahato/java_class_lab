/*
4.	Define a class Student as described below:
Instance variables:
name, age, marks in three subjects (m1, m2, m3), maximum and average.
Methods:
i.  A parameterized constructor to initialize the instance variables.
ii. To accept the details of a student.
iii.To compute the average and minimum out of the three marks.
iv. To display the name, age, marks in the three subjects, minimum and average.
v. Write a main method to create an object of the class and call the above methods.
 */
class Students{
    String name;
    double age,marks1,marks2,marks3,minimum,average;
    Students(String n,double a,double m1,double m2,double m3){
        name=n;
        age=a;
        marks1=m1;
        marks2=m2;
        marks3=m3;
    }
    void getAvg(){
        average=(marks1+marks2+marks3)/3;
        System.out.println("Average of the marks : "+average);
    }
    void getMin(){
        minimum = Math.min(Math.min(marks1,marks2),marks3);
        System.out.println("Minimum marks  : "+minimum);
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Marks 1 : "+marks1);
        System.out.println("Marks 2 : "+marks2);
        System.out.println("Marks 3: "+marks3);
    }
}
public class StudMark {
    public static void main(String[] args) {
       Students s=new Students("sumit",15,57,98,52);
       s.display();
       s.getAvg();
       s.getMin();
    }
}
