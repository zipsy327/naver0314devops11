package day0322;

class Member
{
	private String name;
	private String hp;
	private String addr;
	
	//생성자
	
	//setter
	
	//getter
	
}
public class Ex10_ClassMunje {

	public static void writeMember(Member m)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member();
		Member m2=new Member("이강인");
		Member m3=new Member("손흥민","010-2222-3333");
		Member m4=new Member("Candy","010-444-5555","제주도");
		
		System.out.println("** 멤버 명단 출력 **");
		writeMember(m1);
		writeMember(m2);
		writeMember(m3);
		writeMember(m4);
	}
}
