import java.util.Scanner;
public class Exercitiu6Curs3{
	public static void main(String[] args) {
		int baniCeruti;
		int pin = 1234;
		int baniDisponibili = 3450;
		acceptingPin();
		askingMoney();
		}

		// Metoda de a cere si averifica PIN-ul
	public static void acceptingPin(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Va rugam sa introduceti PIN-ul: ");
		int pin = scanner.nextInt();
		if (pin == 1234){
			System.out.println("PIN-ul introdus este corect !");
			}else{
				System.out.println("PIN-ul introdus nu este corect, cont blocat !");
				System.exit(0);
		}
	}

		// Metoda de a cere bani si a verifica disponibilitate si cati au ramas sau refuz.
	public static void askingMoney(){
		Scanner scanner = new Scanner(System.in);
		int baniDisponibili = 3450;
		System.out.println("Va rugam sa introduceti suma pe care doriti sa o retrageti: ");
		int baniCeruti = scanner.nextInt();
		if (baniCeruti <= baniDisponibili){
			System.out.println("Va rugam sa ridicati banii in cateva secunde.");
			int baniRamasi = baniDisponibili - baniCeruti;
			System.out.println("Suma ramasa in cont este: " +baniRamasi);
		}else{
			System.out.println("Suma ceruta nu este disponibila in cont.");
		}
	}
}
	
