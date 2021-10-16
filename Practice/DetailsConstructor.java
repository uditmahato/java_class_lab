class PrintUdit{
    int age;
    int weight;

    //Default Constructor for name
     PrintUdit(){
         age=5;
         weight=21;
     }
    //Parameterized constructor

    PrintUdit(int ag,int wt){
        age=ag;
        weight=wt;
    }
    PrintUdit(int a){
         age=a;
         weight = 70;
    }
    void display(){
        System.out.println("Age was "+ age +" "+"weight was "+ weight);
    }
}
public class DetailsConstructor {
    public static void main(String[] args) {
        //create object
        PrintUdit d1= new PrintUdit();
        PrintUdit d2= new PrintUdit(10,30);
        PrintUdit d3= new PrintUdit(45);

        d1.display();
        d2.display();
        d3.display();

    }
}
