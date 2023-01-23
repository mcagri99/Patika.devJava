package sesliSessizUnlu;

public class Main {

	public static void main(String[] args) {
  
		char harf = 'U';
				
				char[] sesliHarfler = {'A','O','U','I'};
		        char[] sessizHarfler = {'E','i'};
		        
		        for (char d : sesliHarfler) {
		        	 if(d==harf) {
		        		 System.out.println("sesli harf");
		        		 break;
		        	 }
		        	 else continue;
		        		 }
		        
		        for (char c : sessizHarfler) {
					if(c==harf) {
						System.out.println("Sessiz harf");
						break;
					}
					else continue;
				}
		        
		        
		
	}

}
