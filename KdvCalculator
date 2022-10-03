import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Urun fiyatini giriniz: ");
		
		double fiyat = scan.nextDouble();
		scan.close();
		
		if(fiyat<1000) {
			
			double kdvliFiyat = fiyat+=fiyat*18/100;
			System.out.println("Kdv'li fiyattt: " + kdvliFiyat);
		}
		else {
			
		 double kdvliFiyat = fiyat+=fiyat*8/100;
		  System.out.println("Kdv'li fiyat: " + kdvliFiyat);
		}
		
		

	}

}
