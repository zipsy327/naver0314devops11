package day0327;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex2_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1=new HashSet<String>();
		set1.add("이청아");
		set1.add("유지태");
		set1.add("이미자");
		set1.add("한가인");
		set1.add("강호동");
		set1.add("이청아");
		
		System.out.println("set1 의 갯수 : "+set1.size());
		
		System.out.println("** 출력 1 **");
		for(String s:set1)
			System.out.println(s);
		
		System.out.println("** 출력 2 **");
		Iterator<String> iter=set1.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
