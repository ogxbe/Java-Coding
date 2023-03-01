import java.util.Scanner;


public class Calc {
    
    /**
     * Constructor
     */
    Calc(){

    }

    Scanner scnr = new Scanner(System.in);
   public double answer;
   public  String redo;
    public char operator;
    private double number1;
    private double number2; // set these up in order to do data encapusaltion
    //methods

    //add
    public void add(double num1, double num2){
    
    answer = Double.sum(num1,num2);
    System.out.print(num1 + " + " + num2 + " = " + answer);
    System.out.println();
    
    
    }
    //subtract
    public void subtract(double num1, double num2)
    {

     answer = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + answer);
        System.out.println();
      
    
    }
//multiply
    public void multiply(double num1, double num2){

        answer = (num1 * num2);
        System.out.println(num1 + " * " + num2 + " = " + answer);
        System.out.println();
      

    }
    
    //divide

    public void divide(double num1, double num2){
      
        answer = (num1/num2);
        System.out.println(num1 + " / " + num2 + " = " + answer);
        System.out.println();
      
        
    }

    // powers
    public void powers(double num1, double num2){
answer = Math.pow(num1, num2);
System.out.println(num1 + " to the power of " + num2 + " = " + answer);
System.out.println();
return;

    } 
// squareroot
    public void squareRoot(double num1){ // figure out how to make it repeat until they give a positive number, or learn how to do complex numbers
        if (num1 < 0){
System.out.println("A negative square root can't be retrieved");
        }
            else
        {
            answer = Math.sqrt(num1);
            System.out.println("The square root of " + num1 + " = " + answer);
            System.out.println();
         
            
        }
        
    } // end main method

    //figure out how to make the answer, num1 in the main file so that it can be used again. ex: answer + 4, in this case the answer now became num1 and num2 is the 4.


    
}//end class