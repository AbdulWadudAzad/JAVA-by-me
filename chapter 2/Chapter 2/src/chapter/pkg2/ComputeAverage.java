package chapter.pkg2;
//Defining required Package for I/O Functions
import java.util.Scanner;

public class ComputeAverage {
    public static void main (String[] args){
    	//Defining Scanner Class for Inputting Data
        Scanner input = new Scanner(System.in);
        
        //Scanning the Values from User
        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        
        //Computing the Average of Inputted Values
        double average = (number1 + number2 +number3)/3;
        
        System.out.println("The average of "+number1+", "+number2+", "+number3+" is "+ average);
        
    }
}
