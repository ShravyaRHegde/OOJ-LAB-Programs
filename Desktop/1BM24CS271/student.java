import java.util.*;
public class student{
    //String usn,name;
    //int n;
   

     double calculate(int c[],int m[],int n)
    {
        int bsgpa=0,sum=0,grade=0,total=0;
        double sgpa=0.0;
        for(int i=0;i<n;i++)
        {
        if(m[i]>=90)
        grade=10;
        else if(m[i]>=80 && m[i]<90)
        grade=9;
        else if(m[i]>=70 && m[i]<80)
        grade=8;
        else if(m[i]>=60 && m[i]<70)
        grade=7;
        else if(m[i]>=50 && m[i]<60)
        grade=6;
        else if(m[i]>=40 && m[i]<50)
        grade=5;
        else
        grade=0;
        sum+=c[i];  //sum of credits
        total=c[i]*grade;   
        bsgpa+=total;             
        }
        sgpa=bsgpa/sum;
        return sgpa;
    }
     void display(String usn,String name,double sgpa)
    {
        
        System.out.println("Details:\nUSN:"+usn+"\nName:"+name+"\nSGPA:"+sgpa);
    }
    public static void main(String[] args)
    {          
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int n=sc.nextInt();
        System.out.println("Enter the USN:");
        String usn=sc.nextLine();
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        student s=new student();
        int c[]=new int[n];
        int m[]=new int[n];
        for(int i=0;i<n;i++)
        {
          c[i]=sc.nextInt();
          m[i]=sc.nextInt();
        }
        double sgpa=s.calculate(c,m,n);
        s.display(usn,name,sgpa);
    }
}