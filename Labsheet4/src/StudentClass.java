/*
1.	Write a class named Student. This class should contain some member variable(such as: name, age, rollno...). Define two method as mentioned below
a.	InitializeStudent(): This method will initialize object by taking all required variable as argument and assign it to the member variables.
b.	printData(): this method will print all the data of student in formatted output format.
*/
class Student{
    String name;
    int age;
    int rollno;
    void initializeStudent(String n,int a,int r){
        name=n;
        age=a;
        rollno=r;
    }
    void printData(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Roll no : "+rollno);
    }
}
public class StudentClass {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.initializeStudent("Princu",9,1);
        stu.printData();
    }
}
