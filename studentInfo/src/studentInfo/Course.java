package studentInfo;

public class Course {

	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	int sozlu;
	int sozluYuzde;
	
	
	Course(String name, String code, String prefix, int sozluYuzde) {
		
		
		this.name= name;
		this.code = code;
		this.prefix = prefix;
		this.sozluYuzde = sozluYuzde;
		int note = 0;
		int sozlu = 0;
		
	}
	
	void addTeacher(Teacher teacher) {
		
		if(teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
		}
		else {
			System.out.println("Ogretmen ve ders uyusmuyor!!!!!");
		}
		
	}
	
	void printTeacher() {
		this.teacher.print();
	}
}
