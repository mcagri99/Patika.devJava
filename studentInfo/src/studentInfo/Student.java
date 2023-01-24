package studentInfo;

public class Student {
	
	Course c1;
	Course c2;
	Course c3;
	
	String name;
	String stuNo;
	String classes;
	double avarage;
	boolean isPass;



   Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
	   
	    this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.avarage = 0.0;
		this.isPass = false;
	   
   }
   
   void addBulkExamNote(int note1,int sozlu1, int note2, int sozlu2, int note3, int sozlu3) {
	   if(note1>=0 && note1<=100) {
	        this.c1.note = note1;
	   }
	   
	   if(sozlu1>=0 && sozlu1<=100) {
	        this.c1.sozlu = sozlu1;
	   }
	   if(note2>=0 && note2<=100) {
	        this.c2.note = note2;
	   }
	   if(sozlu2>=0 && sozlu2<=100) {
	        this.c2.sozlu = sozlu2;
	   }
	   
	   if(note3>=0 && note3<=100) {
	        this.c3.note = note3;
	   }
	   if(sozlu3>=0 && sozlu3<=100) {
	        this.c3.sozlu = sozlu3;
	   }
   }
   
   void isPass() {
	   this.avarage =  ((((this.c1.sozlu*this.c1.sozluYuzde)+(this.c1.note*(100-this.c1.sozluYuzde)))/100)+
	   (((this.c2.sozlu*this.c2.sozluYuzde)+(this.c2.note*(100-this.c2.sozluYuzde)))/100)+
	   (((this.c3.sozlu*this.c3.sozluYuzde)+(this.c3.note*(100-this.c3.sozluYuzde)))/100))/3;
	   
	   if(this.avarage>=55) {
		   System.out.println("Sınıf gectiniz");
	   }
	   else {
		   System.out.println("Kaldiniz");
	   }
   }
   
   
   void printNote() {
	   System.out.println(this.c1.name + "Notu\t:" + ((this.c1.sozlu*this.c1.sozluYuzde)+(this.c1.note*(100-this.c1.sozluYuzde)))/100);
	   System.out.println(this.c2.name + "Notu\t:" + ((this.c2.sozlu*this.c2.sozluYuzde)+(this.c2.note*(100-this.c2.sozluYuzde)))/100);
	   System.out.println(this.c3.name + "Notu\t:" + ((this.c3.sozlu*this.c3.sozluYuzde)+(this.c3.note*(100-this.c3.sozluYuzde)))/100);
	   System.out.println("Ortalamanız :" + this.avarage);
   }
   
   
   }

