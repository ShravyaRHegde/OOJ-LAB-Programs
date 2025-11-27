// Program-2:
// A billing system needs a utility method to convert an amount from dollars to rupees (1 USD = 83 INR).
//  Create an interface CurrencyConverter that contains:
// An abstract method billAmount()
// A static method dollarToInr(double amount) that returns converted INR value
// Write a Java program that calls the static method using the interface name (not using object).
import java.util.*;
interface CurrencyConverter{
    public double billAmount();
    public static double dollarToInr(double amount){
        return amount*83.0;
    }
}

class practice_2 implements CurrencyConverter{
    public double billAmount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount:");
        double amount=sc.nextDouble();
        return amount;
    }
    public static void main(String args[]){  
        practice_2 b=new practice_2();
        double amount=b.billAmount();            
        double res=CurrencyConverter.dollarToInr(amount);
        System.out.println("INR:"+res);
    }
}