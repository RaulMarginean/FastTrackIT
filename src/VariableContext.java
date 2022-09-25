public class VariableContext{

	public static int classVariable = 13;

	public static void main(String[] args) {
		System.out.println(classVariable);

		int = 19;
		method(a);
		
	}

	/**
	 * This is a method to try out variable scope
	 * @param parameter This is a value passed on by the caller
	 * @return Returns void
	 */

	public static void method(){
		System.out.println(classVariable);
		int methodVariable = 34;
		System.out.println(methodVariable);
		if(methodVariable > 10){
			int ifVariable = 88;
			System.out.println(ifVariable);
			System.out.println(methodVariable);
			System.out.println(classVariable);			


		}

		/**
		 * This will return the sum
		 * @param a is the first  number to be added
		 * @param b is the sconde number to be added
		 * 
		 * @return is the sum of a and b
		 */
		public static int sum(int a, int b){
			return a+b;
		}

	}

}