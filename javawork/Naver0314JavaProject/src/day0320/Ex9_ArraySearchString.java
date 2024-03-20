package day0320;

import java.util.Scanner;

public class Ex9_ArraySearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []members= {"강호동","한가인","유재석","이승민","강하나",
				"손미나","이영자","박남정","한지혜","손창민"};
		/*
		 * 검색할이름(searchName) 을 입력하면 몇번째에 있는지 출력
		 * 없을경우 없다고 출력
		 * (반복해서 검색을 하다가 'q' 나 'Q' 를 입력시 종료
		 */
		Scanner sc=new Scanner(System.in);
		int searchIndex;
		String searchName;
		while(true)
		{
			searchIndex=-1;
			System.out.println("검색할 이름을 입력하세요");
			searchName=sc.nextLine();
			if(searchName.equalsIgnoreCase("q"))
			{
				System.out.println("검색을 종료합니다");
				break;
			}

			for(int i=0;i<members.length;i++)
			{
				if(searchName.equals(members[i]))
				{
					searchIndex=i;
					break;
				}
			}
			if(searchIndex==-1)
				System.out.println("\t"+searchName+" 님은 멤버명단에 없습니다");
			else
				System.out.println("\t"+searchName+" 은 "+(searchIndex+1)+"번째에 있습니다");
			System.out.println();			
		}
	}

}
