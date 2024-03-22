package day0322;

class Student
{
	private String name;
	private int kor,eng,tot;
	private double avg;
	
	Student()
	{
		this("이름미정",20,20);//반드시 첫줄이어야만 한다,3번째 생성자 호출
	}
	
	Student(String name)
	{
		this(name,50,60);
	}
	
	Student(String name,int kor,int eng)
	{
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		
		this.tot=kor+eng;
		this.avg=tot/2.0;
	}
	
	public void disp()
	{
		System.out.println("이름 : "+name);
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("총 점 : "+tot);
		System.out.println("평 균 : "+avg);
		System.out.println("=".repeat(20));
	}
}
public class Ex9_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student();
		Student stu2=new Student("한소희");
		Student stu3=new Student("강호동", 90, 89);
		
		stu1.disp();
		stu2.disp();
		stu3.disp();		
	}

}
















