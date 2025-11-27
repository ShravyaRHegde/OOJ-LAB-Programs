 import java.util.*;
class Book
{
    String name,author;
    float price;
    int num_pages;
    public Book(String name,String author,int price,int num_pages)
    {
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }

}
class example
{

    public Book set()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.next();
        System.out.println("Enter the author name:");
        String author=sc.next();
        System.out.println("Enter the price:");
        float price=sc.nextFloat();
        System.out.println("Enter the number of pages:");
        int num_pages=sc.nextInt();
        Book b1=new Book(name,author,price,num_pages);
        return b1;
    }
    public void get(Book b1)
{
    System.out.println("Name:"+b1.name+"\nAuthor:"+b1.author+"\nPrice:"+b1.price+"Number of pages:"+b1.num_pages);
}
public static void main(String[] args)
{ 
    Book b;
    example e=new example();
    b=e.set();
    e.get(b);
}
}