 public class MethodExample{
 	public static void main(String[] args) {
 		String result = myMethod("Telefon", 155.5);
 		System.out.println(result);
 	}

 	public static String myMethod(String product, double price){
 		return product + " has price of " + price;
 	}
 }
