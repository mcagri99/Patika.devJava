package enBuyukEnKucuk;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 0;
		int max= 0;
		int kucukMu;
		
		System.out.println("Kac tane sayi gireceksiniz?");
		int toplam = scan.nextInt();
		
		for(int i=1; i<=toplam; i++) {
			System.out.println(i+". sayiyi giriniz");
			  kucukMu = scan.nextInt();	 
			 
			 if(kucukMu<min) {
				min = kucukMu;
				
			 }
			
		}
		System.out.println(min);
	}

}
