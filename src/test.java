 /*program to generate a user-defined exception called
 NegativeAgeException if user inputs negative value for age*/
public class test extends Exception {
    private int age;
 
    //constructor to initialize the value of age
    public test(int age){
        this.age = age;
    }
    //method with return type string
    public String toString(){
        return "Age cannot be negative" + " " +age ;
    }
}