package calculatorWithSwitchCase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Birinci sayiyi giriniz");
		int n1 = scan.nextInt();

		System.out.println("ikinci sayiyi giriniz");
		int n2 = scan.nextInt();

		System.out.println("1-toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
		System.out.println("Seciminiz: ");
		int secim = scan.nextInt();
		scan.close();

		switch (secim) {
		case 1:
			System.out.println(n1 + n2);
			break;
		case 2:
			System.out.println(n1 - n2);
			break;
		case 3:
			System.out.println(n1 * n2);
			break;
		case 4:
			System.out.println(n1 / n2);
			break;
		default:
			System.out.println("Yanlis deger girdiniz");
			break;
		}

	}

}
