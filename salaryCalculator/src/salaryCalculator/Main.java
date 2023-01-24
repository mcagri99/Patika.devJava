package salaryCalculator;

public class Main {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Cagri", 1500, 40, 2004);
		
		employee1.tax();
		employee1.bonus();
        employee1.raiseSalary();
        employee1.employeeInfo();
	}

}
