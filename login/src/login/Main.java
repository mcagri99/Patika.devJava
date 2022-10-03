package login;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		  
       Scanner scan = new Scanner(System.in);
       
       String userName,password;
       String realUserName = "patika";
       String realPassword = "java123";
		System.out.println("Kullanici adiniz: ");
		userName = scan.nextLine();
		
		System.out.println("Sifreniz: ");
		password = scan.nextLine();
		
		if(userName.equals(realUserName) && password.equals(realPassword)) {
			
			System.out.println("Giris basarili");
		}
		else if(userName.equals("patika") && !password.equals("java123")) {
			System.out.println("Yanlis sifre girdiniz");
			System.out.println("Sifrenizi guncellemek isterseniz 1 e basiniz");
			int sifreDegis = scan.nextInt();
			scan.nextLine();
			if(sifreDegis==1) {
				System.out.println("Yeni sifrenizi giriniz. Yeni sifre eski sifre ile ayni olamaz");
				String newPassword = scan.nextLine();
				
				if(newPassword.equals("java123")) {
					System.out.println("Yeni sifre eski sifre ile aynı olamaz");
				}
				else {
					System.out.println("Sifreniz guncellendi");
					realPassword=newPassword;
					System.out.println("yeni sifreniz: "+ realPassword);
				}
			}
			else {
				System.out.println("Sifreniz hatali"); ;
			}
			
		}
		else {
			System.out.println("Yanlis kullanici girisi");
		}

	}

}
