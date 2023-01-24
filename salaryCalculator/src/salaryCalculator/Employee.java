package salaryCalculator;

public class Employee {

	String name;
	double salary;
	int workHours;
	int hireYear;
	double vergi;
	int bonus;
	double maasZam;
	
	Employee(String name, double salary, int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		this.vergi = 0;
		this.bonus = 0;
		this.maasZam = 0;
	}
	
	public void tax() {
		if(this.salary>1000) {
			this.vergi = this.salary*0.03;
		}
		System.out.println("Verginiz :" + this.vergi + " TL");
	}
	
	public void bonus() {
		if(this.workHours>40) {
			this.bonus = (this.workHours - 40) * 30;
		}
		System.out.println("Bonusunuz:" + this.bonus + " TL");
	}
	
	public void raiseSalary() {
		if(this.hireYear>2011) {
			this.maasZam = this.salary*0.05;
		}
		else if(this.hireYear>2001) {
		this.maasZam = this.salary*0.1;
	}
	else {
		this.maasZam = this.salary*0.15;
	}
		System.out.println("maas zamminiz: " + this.maasZam + " TL");
		System.out.println("------------------------------------- ");
	}
	
	public void employeeInfo() {
		System.out.println("Adi : " + this.name);
		System.out.println("Maasi : " + this.salary);
		System.out.println("Calisma saati : " + this.workHours);
		System.out.println("Baslangic yili : " + this.hireYear);
		System.out.println("Vergi : " + this.vergi);
		System.out.println("Bonus : " + this.bonus);
		System.out.println("Maas artisi : " + this.maasZam);
		System.out.println("Vergi ve Bonuslar ile birlikte maas : " + (this.salary + this.bonus - this.vergi));
		System.out.println("Yeni zamli maas : " + (this.salary + this.maasZam));
		
	}
}
