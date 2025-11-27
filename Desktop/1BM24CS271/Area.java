import java.util.*;
abstract class shape{
    int x,y;

    abstract void printArea();
    
}
class Rectangle extends shape{
    Rectangle(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    void printArea(){
        System.out.println("Area of the Rectangle is:"+(x*y));
    }
}
class Circle extends shape{
    Circle(int x){
        this.x=x;
    }
    void printArea(){
        System.out.println("Area of the Circle is:"+(3.14*x*x));
    }
}
class Triangle extends shape{
    Triangle(int x,int y){
        this.x=x;
        this.y=y;
    }
    void printArea(){
        System.out.println("Area of the Triangle is:"+(0.5*x*y));
    }
}
class Area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Enter the base and height of the triangle:");
        int b=sc.nextInt();
        int h=sc.nextInt();
        System.out.println("Enter the radius of the circle:");
        int r=sc.nextInt();
        shape ob1=new Rectangle(x,y);
        shape ob2=new Triangle(b,h);
        shape ob3=new Circle(r);
        ob1.printArea();
        ob2.printArea();
        ob3.printArea();
        sc.close();
    }
}