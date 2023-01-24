
public class Main {

	public static void main(String[] args) {
		
		int[] list = {17,57,89,3,99,102};
		
		double avarage=0;
		double sum = 0;
		
		
		for (int i : list) {
			
			sum = sum +i;
		}
		avarage = sum/list.length;
		System.out.println(avarage);

	}

}
