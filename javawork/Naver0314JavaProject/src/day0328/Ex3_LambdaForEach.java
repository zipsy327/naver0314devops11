package day0328;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Ex3_LambdaForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List 에 데이타를 넣고 출력하는 방법 1
		List<String> list1=new Vector<String>();
		list1.add("빨강색");
		list1.add("노랑색");
		list1.add("분홍색");
		list1.add("초록색");
		
		for(String s:list1)
			System.out.println(s);
		System.out.println("=============");
		//List 에 데이타를 넣고 출력하는 방법 2
		List<String> list2=Arrays.asList("장미꽃","다알리아","칸나","안개꽃","후리지아");
		
		list2.forEach(s->System.out.println(s));
	}

}












