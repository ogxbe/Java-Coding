import java.util.Scanner;

public class CalcDriver {

    public static void main(String[] args) {
       
        Calc Calculator = new Calc();
        Scanner scnr = new Scanner(System.in);
        
        char operator;
        Double number1 = null;
        Double number2 = null;
        Double answer = null; 
        String doAgain = "Y";

        
        Scanner newNum = new Scanner(System.in);

        // neeed to make command a string so i can do exit

        System.out.println("Choose an operator: +, -, *, p, ^");
    
            operator = scnr.next().charAt(0); 

if (operator == '^')
{
    System.out.println("Please enter your number");
    number1 = scnr.nextDouble();
    Calculator.squareRoot(number1);
    System.exit(0);
}
else
{
    System.out.println("Please enter your numbers");
    number1 = scnr.nextDouble();
    number2 = scnr.nextDouble();
}


        


   ///////////////////////////////////////// 

    // while(operator!=' ')
// { 
    
    switch (operator) {

        case '+':
            Calculator.add(number1,number2);
        break;

    
        case '-':
            Calculator.subtract(number1,number2);
        break;

            case '*':
            Calculator.multiply(number1,number2);
        break;

            case '/':
            Calculator.divide(number1,number2);
        break;
        
        case 'p':
            Calculator.powers(number1, number2);
        break;
       
        default: 
            System.out.println("Invalid operator!");
        break;
       
           /*  number1 = answer;, need to make the loop ask for input again for number2, and also have it allow number1 to be set as answer 
           System.out.println("Choose an operator");

           operator = scnr.next().charAt(0); have it ask for another operator if they wanna do more input, if number2 isnt empty
           
           System.out.println("Pleater enter a new number");
           number2 = scan.nextDouble(); 
           */



        } // end of switch
   //  } 
    System.out.println("Your while looped has been exited");
        

    

/* scnr.close(); // closes all input, should use this when i wanna close out of the while loop */
// I can use return; to terminate a thing or System.exit();








} //end main method
    
    } //end class
