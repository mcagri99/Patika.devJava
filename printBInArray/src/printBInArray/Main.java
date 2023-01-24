package printBInArray;

public class Main {

	public static void main(String[] args) {
		
		String[][] arrB = new String[7][4];
		
		for(int i = 0; i < arrB.length ; i++) {
			for(int j = 0; j < arrB[i].length ; j++) {
				if(i==0 || i==3 || i==6) {
					arrB[i][j] = " * ";
				}
				else if(j==0 || j==3) {
					arrB[i][j] = " * ";
				}
				else {
					arrB[i][j] = "   ";
				}
			}
		}
		for (String[] strings : arrB) {
			for (String strings2 : strings) {
				System.out.print(strings2);
			}
			System.out.println();
		}

	}

}
