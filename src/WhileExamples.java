public class WhileExamples {
	public static void main(String[] args){
	learnContinue();
	}

	public static void learnContinue(){
		System.out.println("Learn continue");
		byte a = 0;
		while (a < 15){
			a++;
			if (a == 10){
				continue;
			}
			System.out.println(a);
		}	
			System.out.println("finished with continue");
	}

}