class WrongAge extends Exception{

    public WrongAge(String message) {
        super(message);
    }
    
}
class Father{
    int fage;
    Father(int fage) throws WrongAge{
        if(fage<0)
            throw new WrongAge("Age cannot be less than zero!");
        else{
            System.out.println("Father's age accepted"); 
            this.fage=fage;
        }       
        }
    }
class Son extends Father{
    int sage;
    Son(int sage,int fage)  throws WrongAge{
        super(fage);
        if(sage>=fage)
            throw new WrongAge("Son's age cannot greater than father's");
        else{
            System.out.println("Son's age accepted");
            this.sage=sage;
        }
    }        
}
public class exception_handling{
    public static void main(String[] args){
        try{
        Father f1=new Father(-2);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        try{
        Father s1=new Son(3,2);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
        Father f2=new Father(40);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try {
            Father s2=new Son(10,40);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        }
    }