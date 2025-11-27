
import java.util.Scanner;

public class LAB01_quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double a,b,c;

        System.out.println("Enter a:");
        a=sc.nextDouble();

        System.out.println("enter b:");
        b=sc.nextDouble();

        System.out.println("enter c:");
        c=sc.nextDouble();

        double D= b*b- 4*a*c;

        if(a==0 ){
            System.out.println("Not a quadratic eq");
        }

        if(D>0){
            System.out.println("Real and distinct roots exist");
            double root1= (-b + Math.sqrt(D))/2*a;
            double root2= (-b - Math.sqrt(D))/2*a;
            System.out.println("Root1="+root1+"\nRoot2="+root2);
        }

        else if(D==0){
            System.out.println("Roots are real and equal");
            double root= -b/(2*a);
            System.out.println("Root value is:"+root);
        }
        else{
            System.out.println("Roots are not real");
        }
        sc.close();
    }
}
