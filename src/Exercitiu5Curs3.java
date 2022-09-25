import java.util.Scanner;
public class Exercitiu5Curs3{
	public static void main(String[] args) {
		
		int result = taxes();
		System.out.println("Your monthly tax is: " + result);
	}

	public static int taxes(){
		Scanner scanner = new Scanner(System.in);
		int result;
		System.out.println("Please enter your monthly income: ");
		int income = scanner.nextInt();		
		if(income <= 2000){
			result = 0;
		}else if (income <= 5000){
			result = income*20/100;
		}else{
			result = income*35/100;
		}
		return result;
	}
}