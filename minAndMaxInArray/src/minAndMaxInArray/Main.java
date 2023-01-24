package minAndMaxInArray;

public class Main {

	public static void main(String[] args) {
	
		int[] list = {-6,65,-142,3,99,102};
		
		int min=list[0];
		int max=list[0];
		
		for (int i : list) {
			if(i<min) {
				min = i;
			}
			if(i>max) {
				max = i;
			}
			else continue;
		}

		System.out.println("Min :" + min + "       Max: " + max);
	}

}
