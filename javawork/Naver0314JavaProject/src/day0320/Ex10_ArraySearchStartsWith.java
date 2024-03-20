package day0320;

import java.util.Scanner;

public class Ex10_ArraySearchStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []members= {"강호동","한가인","유재석","이승민","강하나",
				"손미나","이영자","박남정","한지혜","손창민"};
		/*
		 *  검색할 이름은? 강
		 *      1번째 : 강호동
		 *      5번째 : 강하나
		 *      총 2명 검색
		 *      
		 *  검색할 이름은? 박이
		 *      "박이" 로 시작하는 멤버는 없습니다
		 *      
		 *   검색할 이름은? Q
		 *      ** 검색을 종료합니다 **
		 */
		Scanner sc=new Scanner(System.in);
		String searchName;
		int count;
		
		while(true)
		{
			count=0;
			
			System.out.print("검색할 이름은?");
			searchName=sc.nextLine();
			
			//종료코드
			if(searchName.equalsIgnoreCase("q"))
			{
				System.out.println("** 검색을 종료합니다 **");
				break;
			}
			
			//검색
			for(int i=0;i<members.length;i++)
			{
				if(members[i].startsWith(searchName))
				{
					count++;
					System.out.printf("\t%d 번째 : %s\n",i+1,members[i]);					
				}
			}
			if(count==0)
				System.out.println("\t\""+searchName+"\" 로 시작하는 멤버는 없습니다");
			else
				System.out.println("\t총 "+count+" 명 검색");
			System.out.println();
		}
	}

}














