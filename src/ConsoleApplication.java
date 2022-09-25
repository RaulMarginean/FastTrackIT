import java.util.Scanner;

public class ConsoleApplication{
	
	public static void main(String[] args) {
		Scanner numere = new Scanner(System.in);
		System.out.println("Write a number to be divided: ");	
	    double number1 = numere.nextDouble();
	   	System.out.println("by: ");
	    double number2 = numere.nextDouble();
 	    double result = (number1 / number2);
 	    System.out.println(number1 + " divided by "+ number2 +" is "+ result);
 	 		}
}

	
	
 
 
	
		

	

