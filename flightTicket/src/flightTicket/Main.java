package flightTicket;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int km,yas,ucusTipi;
		double indirim=0;
		double netUcret=0;
		
		System.out.println("Ucacaginiz mesafeyi km cinsinden giriniz");
		 km = scan.nextInt();
		 
		 System.out.println("Yasinizi giriniz");
		 yas = scan.nextInt();
		 
		 System.out.println("Yolculuk tipini seciniz\n1-Tek Yon\n2-Gidis Donus");
		 ucusTipi = scan.nextInt();
		 
		 if(!(ucusTipi==1 || ucusTipi==2)){
			 System.out.println("Yanlis deger girdiniz");
		 }
		 
		 double mesafeTutar= km*0.10;
		 
		 if(yas<12) {
			 indirim = mesafeTutar*0.50;
		 }
		 else if(yas>=12 && yas<=24) {
			 indirim = mesafeTutar*0.10; 
		 }
		 else if(yas>65) {
			 indirim = mesafeTutar*0.30;
		 }
		netUcret= mesafeTutar-indirim;
		
	   if(ucusTipi==1) {
		   System.out.println("Toplam tutar = " + netUcret +"TL");
	   }
	   else if(ucusTipi==2) {
		   System.out.println("Toplam tutar = " + 2*(netUcret-(netUcret*0.20))+ "TL");
	   }
	}

}
