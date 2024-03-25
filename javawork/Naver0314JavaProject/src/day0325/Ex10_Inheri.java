package day0325;

//9번에서 만든 Animal,Cat,Dog 클래스를 이용한 예제
//다형성 처리에 대한 예제
public class Ex10_Inheri {
	public static void showAnimal(Animal ani)
	{
		ani.writeAnimal();//이때 ani 변수는 Cat 이 되기도 하고 Dog 가 되기도 한다(누가 생성되어서 넘어오느냐에 따라서)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showAnimal(new Cat());
		showAnimal(new Dog());
	}

}
