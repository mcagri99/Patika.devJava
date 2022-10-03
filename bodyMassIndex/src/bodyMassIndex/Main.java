package bodyMassIndex;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kilonuzu giriniz:");
		int kilo = scan.nextInt();
		
		
		System.out.println("Boyunuzu metre cinsinden giriniz:");
		double boy = scan.nextDouble();
		
		scan.close();
		
		double index = kilo / (boy*boy) ;
		
		System.out.println("Vucut kitle indeksiniz: " + index);

	}

}
