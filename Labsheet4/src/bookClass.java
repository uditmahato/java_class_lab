/*
7.	Write a program to implement a Book class that stores the details of a book namely, bookcode, name of the book, name of the author(s) and price. The class has methods to display any of the details individually.

*/
class Book{
    int bookcode;
    String bookname;
    String bookauthor;
    double price;
    void bookDetails(int bc,String bn,String ba,double p){
        bookcode=bc;
        bookname=bn;
        bookauthor=ba;
        price=p;
    }
    void getBookCode(){
        System.out.println("BOOK CODE : "+bookcode);
    }
    void getBookName() {
        System.out.println("BOOK NAME : "+bookname);
    }
    void getBookAuthor(){
        System.out.println("BOOK AUTHOR : "+bookauthor);
    }
    void getBookPrice(){
        System.out.println("BOOK PRICE : "+price);
    }
}
public class bookClass {
    public static void main(String[] args) {
        Book d1=new Book();
        d1.bookDetails(73547,"The power of subconscious mind","Dr. Joseph Murphy",4500);
        d1.getBookCode();
        d1.getBookName();
        d1.getBookAuthor();
        d1.getBookPrice();
    }
}
