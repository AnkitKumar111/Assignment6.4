import java.util.Scanner;
public class NegativeAgeException {
    public static void main(String[] args) throws Exception{
        int age;
        /*scanner class object is used to take the value of age*/
        Scanner s=new Scanner(System.in);	
    	System.out.println("plz enter age");
    	age=s.nextInt();
        
    	/*Generating NegativeAgeException if user inputs 
    	  negative value for age*/
        if (age < 0){
            throw new test(age);
        }else{
            System.out.println("Age entered is " + age);
        }
        s.close();
    } 
   
}