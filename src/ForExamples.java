public class ForExamples{
	public static void main(String[] args){
		learnFor();
		learnSimplifiedFor();

	}

	public static void learnSimpligfiedFor(){
		System.out.println("learnSimplifiedFor");
		String[] names = {"Ana", "Maria", "George", "Mihai", "Adrian", "Alex"};
		for(String name: names){
			if(name.equals("George")){
				continue;
			}
			if(name.equals("Adrian")){
				break;
			}
			System.out.println(name);
		}
		System.out.println("Finished!");
	}

	public static void learnFor(){
		int[] varsta = {20,12,35,56,87};

		int index = 0;
		while(index < varsta.length){
			System.out.println(varsta[index]);
			index++;
		}

		//echivalent
		for(int i = 0; i < varsta.length; i++){
			System.out.println(varsta[i]);
		}
	}

}