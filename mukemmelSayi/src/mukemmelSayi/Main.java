package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		int sayi = 28;
		int toplam =0;
		
		for (int i = 1; i <=sayi/2; i++) {
			
			if(sayi%i==0) {
				 toplam = toplam +i;
				 
			}
			
		}
		if(sayi==toplam) {
			System.out.println("Sayi mukkemel sayidir");
		}
		else 
			System.out.println("Sayi mukemmel sayi degildir");
	}

}
