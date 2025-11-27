import java.util.*;
public class pointer
{
    int x,y;
    void read(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    void display()
    {
        System.out.println("x="+this.x);
        System.out.println("="+this.y);
    }
    public static void main(String args[])
    {
        pointer p=new pointer();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int a=sc.nextInt();
        System.out.println("Enter the value of y:");
        int b=sc.nextInt();
        p.read(a,b);
        p.display();
    }
}