package day0325;

public class Ex2_ClassStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student []s=new Student[4];
		s[0]=new Student();
		s[1]=new Student("이영자");
		s[2]=new Student(100,90);
		s[3]=new Student("강호동",89,85);
		
		System.out.println("**전체 학생정보 출력**\n");
		System.out.println("번호\t이름\t자바\t스프링\t총점\t평균\t등급");
		System.out.println("=".repeat(60));
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(i+1+"\t"+s[i].getName()+"\t"+s[i].getJava()+"\t"+
					s[i].getSpring()+"\t"+s[i].getTotal()+"\t"+s[i].getAverage()+"\t"+
					s[i].getGrade());
		}
		
		System.out.println("0번 학생 이름,자바,스프링점수 수정");
		s[0].setName("이하나");
		s[0].setScore(80,81);
		
		System.out.println("1번 학생의 스프링점수만 수정");
		s[1].setSpring(99);
		
		System.out.println("2번 학생의 자바 점수만 수정");
		s[2].setJava(60);
		
		System.out.println("** 수정된 데이타로 다시 출력하기 **");
		System.out.println("번호\t이름\t자바\t스프링\t총점\t평균\t등급");
		System.out.println("=".repeat(60));
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(i+1+"\t"+s[i].getName()+"\t"+s[i].getJava()+"\t"+
					s[i].getSpring()+"\t"+s[i].getTotal()+"\t"+s[i].getAverage()+"\t"+
					s[i].getGrade());
		}
		
	}

}
