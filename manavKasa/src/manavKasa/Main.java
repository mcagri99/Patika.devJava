package manavKasa;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in) ;
        
        System.out.println("Armut kac kilo? ");
        double armut = scan.nextDouble();
		
        System.out.println("Elma kac kilo? ");
        double elma = scan.nextDouble();
        
        System.out.println("Domates kac kilo? ");
        double domates = scan.nextDouble();
        
        System.out.println("Muz kac kilo? ");
        double muz = scan.nextDouble();
        
        System.out.println("Patlıcan kac kilo? ");
        double patlican = scan.nextDouble();
        
        double armutPrice = armut * 2.14;
        double elmaPrice = elma * 3.67;
        double domatesPrice = domates * 1.11;
        double muzPrice = muz * 0.95;
        double patlicanPrice = patlican * 5.00;
        
        double toplamTutar = armutPrice + elmaPrice + domatesPrice + muzPrice + patlicanPrice;
        
        System.out.println("Toplam tutar: " + toplamTutar);
        
		
	}

}
