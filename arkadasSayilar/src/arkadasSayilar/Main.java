package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		
        int sayi1 = 1184;
        int sayi2= 1215;
        int toplam1=0;
        int toplam2=0;
        		
        
        for (int i = 1; i <= sayi1/2; i++) {
        	if(sayi1 % i == 0) {
        		toplam1= toplam1 + i ;
        	}
        	
			
		}
        
        for (int i = 1; i <= sayi2/2; i++) {
        	if(sayi2 % i == 0) {
        		toplam2= toplam2 + i ;
        	}
        	
			
		}
        if(toplam1==sayi2 && toplam2==sayi1) {
        	System.out.println("Bu iki sayi arkadas sayidir");
        }
        else 
        	System.out.println("Bu iki sayi arkadas sayi degildir");
	}

}
