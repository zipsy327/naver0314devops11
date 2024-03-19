package day0319;

import java.util.Scanner;

public class Ex11_StringMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제
		 * String 타입의 문자열(msg) 를 입력받아
		 * 그 문자열안에 대문자,소문자,숫자가 몇개가 포함되어있는지 출력하시오
		 * 예)
		 * Happy Day 123!!
		 * 대문자 : 2개
		 * 소문자 : 6개  
		 * 숫 자 : 3개
		 * 
		 *  String 의 charAt 과 length 를 사용하면 됨
		 */
		Scanner sc=new Scanner(System.in);
		String msg;
		int upperAlpha=0,lowerAlpha=0,num=0;
		System.out.println("문장을 입력하세요");
		msg=sc.nextLine();
		
		for(int i=0;i<msg.length();i++)
		{
			//i번지 인덱스의 문자 얻기
			char ch=msg.charAt(i);
			
			if(ch>='a' && ch<='z')
				lowerAlpha++;
			else if(ch>='A' && ch<='Z')
				upperAlpha++;
			else if(ch>='0' && ch<='9')
				num++;
		}
		
		System.out.println("소문자 : "+lowerAlpha);
		System.out.println("대문자 : "+upperAlpha);
		System.out.println("숫 자 : "+num);
		
	}

}
























