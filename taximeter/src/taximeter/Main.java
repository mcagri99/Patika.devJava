package taximeter;
import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		// taksimetre KM başina 2.2 TL tutmaktadir. Açılış ücreti 10 TL. Minimum ödenmesi gereken ücret 20 TL.
       Scanner scan = new Scanner(System.in);
       System.out.println("Kilometreyi giriniz");
       int km = scan.nextInt();
       scan.close();
       double tutar = 10 + km * 2.2;
       
       if(tutar<=20) {
    	   System.out.println("Odenecek tutar: 20 lira " );
       }
       else {
    	   System.out.println("odenecek tutar: " + tutar + " lira");
       }
       
       
       
       
       
	}
         
}
