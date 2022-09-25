import java.util.Scanner;

public class ExercisesCurs3{
		public static void main(String[] args) {
		parametruByte();
		lunileAnului();
		careEsteMaiMare2();
		careEsteMaiMare3();
		}

		//1.
		public static void parametruByte(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("A se introduce o valoare ce corespunde parametru byte: ");	
		byte parametruByte = scanner.nextByte();
		if (parametruByte > (0-128) && parametruByte < 127){
			System.out.println("Felicitari acest numar se incadreaza ca a fi un byte.");
			}else{
				System.out.println("Mai incearca, numatrul introdus nu corespunde.");
		}
	}
	


		//2.
		public static void lunileAnului(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Invata Lunile anului de la 1 la 12: ");	
		int numarulLunii = scanner.nextInt();

			switch (numarulLunii){
			case 1:
				System.out.println("Ianuarie");
				break;
			case 2:
				System.out.println("Februarie");
				break;
			case 3:
				System.out.println("Martie");
				break;
			case 4:
				System.out.println("Aprilie");
				break;
			case 5:
				System.out.println("Mai");
				break;
			case 6:
				System.out.println("Iunie");
				break;
			case 7:
				System.out.println("Iulie");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("Septembrie");
				break;
			case 10:
				System.out.println("Octombrie");
				break;
			case 11:
				System.out.println("Noiembrie");
				break;
			case 12:
				System.out.println("Decembrie");
				break;
			default:
				System.out.println("Nu exista decat 12 luni ale anului. Mai incearca.");
				
			}
		}
		//3.
		public static void careEsteMaiMare2(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Va rog sa introduceti valori pentru urmatoarele variabile");
		System.out.println("A se introduce prima valoare: ");
		int primulNumar = scanner.nextInt();
		System.out.println("A se introduce a doua valoare: ");
		int alDoileaNumar = scanner.nextInt();
		if( primulNumar > alDoileaNumar){
			System.out.println(primulNumar + " este mai mare decat " + alDoileaNumar);
			}else if(primulNumar == alDoileaNumar){
				System.out.println("Cele doua valori sunt egale");
			}else{
				System.out.println(alDoileaNumar + " este mai mare decat " + primulNumar);
			}
		}
		

		//4.
		public static void careEsteMaiMare3(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Va rog sa introduceti valori pentru urmatoarele variabile");
		System.out.println("A se introduce prima valoare: ");
		int primulNumar = scanner.nextInt();
		System.out.println("A se introduce a doua valoare: ");
		int alDoileaNumar = scanner.nextInt();
		System.out.println("A se introduce a treia valoare: ");
		int alTreileaNumar = scanner.nextInt();

		if( primulNumar > alDoileaNumar && primulNumar > alTreileaNumar){
			System.out.println(primulNumar + " este mai mare decat " + alDoileaNumar + " si " + alTreileaNumar);
			}else if (alDoileaNumar > alTreileaNumar && alDoileaNumar > primulNumar){
				System.out.println(alDoileaNumar + " este mai mare decat " + alTreileaNumar + " si "+ primulNumar);
			}else if (alTreileaNumar > primulNumar &&  alTreileaNumar> alDoileaNumar){
				System.out.println(alTreileaNumar + " este mai mare decat " + primulNumar + " si " + alDoileaNumar);
			}else{
				System.out.println("Nu se poate face comparatie intre cel 3 numere.");
			}
		}
	}
	

