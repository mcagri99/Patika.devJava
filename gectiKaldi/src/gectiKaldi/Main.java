package gectiKaldi;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int mat,fizik,turkce,kimya,muzik;
		int counter =0;
		
		System.out.println("Matematik notunuzu giriniz: ");
		mat = scan.nextInt();
		

		System.out.println("Fizik notunuzu giriniz: ");
		fizik = scan.nextInt();
		
		System.out.println("Turkce notunuzu giriniz: ");
		turkce = scan.nextInt();
		
		System.out.println("Kimya notunuzu giriniz: ");
		kimya = scan.nextInt();
		
		System.out.println("Muzik notunuzu giriniz: ");
		muzik = scan.nextInt();
		
		if(mat<=100 && mat>=0) {
			
			counter++;
			} 
		else mat=0;
		
		if(fizik<=100 && fizik>=0) {
			counter++;
			}
		else fizik=0;
		
		if(turkce<=100 && turkce>=0) {
			counter++;
			}
		else turkce=0;
		
		if(kimya<=100 && kimya>=0) {
			counter++;
			}
		else kimya=0;
		
		if(muzik<=100 && muzik>=0) {
			counter++;
			}
		else muzik=0;
		
		double ortalama =(mat +  fizik + turkce + kimya + muzik)/counter;
		
		
		   if(ortalama>=55) {
			   System.out.println("Sınıfı gectiniz");
		   }
		   else {
			   System.out.println("Kaldiniz");
		   }
	      System.out.println("Ortalmaniz: " + ortalama);
	}

}
