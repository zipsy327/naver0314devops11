package day0326;

abstract class AbsEx1
{
	abstract public void play();	
}

abstract class AbsEx2 extends AbsEx1
{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("게임을 합니다");
	}
	
	abstract public void study();
}

class AbstEx3 extends AbsEx2
{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		super.play();
		System.out.println("야구게임을 합니다");
	}
	
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("공부를 합니다");
	}
}

public class Ex2_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsEx2 abs=new AbstEx3();
		abs.play();
		abs.study();
	}

}




















