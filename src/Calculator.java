import java.util.Scanner;

public class Calculator{
	public static void main(String[] args) {
		String operation;
		do{
		System.out.println("Write two numbers and an operator");
		System.out.println("Number 1:");
		Scanner scanner = new Scanner( System.in);
		double number1 = scanner.nextDouble();
		System.out.println("Number 2:");
		double number2 = scanner.nextDouble();
		System.out.println("Operation (+ - * /");
		operation = scanner.next();
		System.out.println("Result:" + applyOperator(number1, number2, operation));
	} while(!operation.equals("exit"));
}

	public static double applyOperator(double a, double b, String operator){
		switch(operator){
		case "+": return a + b;
		case "-": return a - b;
		case "*": return a * b;
		case "/": return divide(a, b);
		default: return 0;
		}
	}

	public static double divide(double n1, double n2){
		return n2 == 0 ? Double.MAX_VALUE : n1 / n2;
	   }

	}