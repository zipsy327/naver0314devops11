package day0318;

import java.util.Scanner;

public class Ex13_ForMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("지수승 구하기");
		System.out.println("3의 3승은 "+(int)Math.pow(3, 3));
		System.out.println("2의 4승은 "+(int)Math.pow(2, 4));
		
		/*
		 * x,y 두숫자를 입력후 x의y승값을 구하시오
		 * 예)
		 * x? 3
		 * y? 4
		 * 3의4승은 81입니다
		 */
		Scanner sc=new Scanner(System.in);
		int x,y,sum=1;
		
		System.out.println("두수 x,y 값 입력하기");
		x=sc.nextInt();
		y=sc.nextInt();
		
		for(int i=1;i<=y;i++)
		{
			sum*=x;
		}
		System.out.printf("%d의 %d승은 %d입니다",x,y,sum);
	}

}













