package boxGame;

public class Main {

	public static void main(String[] args) {
		
		
		Fighter f1 = new Fighter("Joshua", 13, 100, 110, 30);
		Fighter f2 = new Fighter("Wilder", 11, 90, 105, 45);
		
		Match match = new Match(f1,f2,100,150);
		match.run();
       
	}

}
