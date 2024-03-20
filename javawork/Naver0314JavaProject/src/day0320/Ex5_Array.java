package day0320;

public class Ex5_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언하는 여러가지 방법
		int []arr1;
		//arr1 에 배열에 몇개를 넣을지 갯수만큼 할당
		arr1=new int[5];//이때 각 배열에는 0의 초기값이 할당이 된다(객체인경우는 null 로 초기값이 할당)
		
		System.out.println("arr1의 갯수:"+arr1.length);
		
		System.out.println("** arr1 의 초기값 출력 **");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(i+":"+arr1[i]);
		}
		
		System.out.println("** 배열에 일부 값을 변경후 출력해보자 **");
		arr1[0]=5;
		arr1[4]=30;
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(i+":"+arr1[i]);
		}
		
		System.out.println("** 다른 방법으로도 출력해보자(for문) **");
		for(int a:arr1)
		{
			System.out.println(a);
		}
	}

}







