package studentInfo;

public class Main {

	public static void main(String[] args) {
		
		
		Teacher t1 = new Teacher("Mahmut Orhan", "5555234", "TRH");
		Teacher t2 = new Teacher("Nicola Tesla", "4534534", "FZK");
		Teacher t3 = new Teacher("Fidan", "34234234", "BIO");
		
		Course tarih = new Course("Tarih", "101","TRH", 20);
		Course fizik = new Course("Fizik", "102","FZK", 30);
		Course biyoloji = new Course("Biyoloji", "103", "BIO", 25);
		
		
		
		tarih.addTeacher(t1);
		fizik.addTeacher(t2);
		biyoloji.addTeacher(t3);
		

		Student s1 = new Student("Cagri","511", "4",tarih, fizik, biyoloji);
		
		s1.addBulkExamNote(12,60,87,100,32,50);
		
		s1.isPass();
		
		s1.printNote();
	}

}
