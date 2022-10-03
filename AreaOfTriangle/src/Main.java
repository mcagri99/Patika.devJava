import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci kenar uzunluğunu giriniz:");
		int kenar1 = scan.nextInt();
		System.out.println("Ikinci kenar uzunluğunu giriniz:");
		int kenar2 = scan.nextInt();
		System.out.println("Ucuncu kenar uzunluğunu giriniz:");
		int kenar3 = scan.nextInt();
		scan.close();
		
		double cevre = kenar1 + kenar2 + kenar3 ;
		
		double u = cevre/2;
		System.out.println(	"u: " + u);
		double area = Math.sqrt(u*Math.abs(u-kenar1)*Math.abs(u-kenar2)*Math.abs(u-kenar3));
		
		System.out.println("Ucgenin alani: " + area);

	}

}
