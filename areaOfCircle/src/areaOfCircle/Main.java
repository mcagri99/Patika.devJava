package areaOfCircle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Dairenin yaricapını giriniz");
		int r = scan.nextInt();
		System.out.println("Dairenin merkez aci olcusunu giriniz");
		int a = scan.nextInt();
		scan.close();
		
		double pi = 3.14;
		
		double alan = (pi*(r*r)*a)/360;
		
		System.out.println("Kesitin alani= " + alan);

	}

}
