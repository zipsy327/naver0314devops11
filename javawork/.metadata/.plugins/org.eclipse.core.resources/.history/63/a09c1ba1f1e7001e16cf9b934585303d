package day0321;

import java.util.Scanner;

public class Book199_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//교재 199페이지 문제9번 풀기
		Scanner sc=new Scanner(System.in);
		int inwon=0,num=0,max=0,sum=0;
		double avg=0;
		int []score=null;
		
		Exit:
		while(true)
		{
			System.out.println("-".repeat(50));
			System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-".repeat(50));
			num=sc.nextInt();
		
			switch(num)
			{
				case 1:
					System.out.print("학생수 >>");		
					inwon=sc.nextInt();
					//배열 메모리 할당
					score=new int[inwon];
					break;
				case 2:
					for(int i=0;i<score.length;i++)
					{
						System.out.print("scores["+i+"] >>");
						score[i]=sc.nextInt();
					}
					break;
				case 3:
					System.out.println("** 입력한 점수들 **");
					for(int i=0;i<score.length;i++)
					{
						System.out.printf("%d 번째 점수 : %d점\n",i+1,score[i]);
					}
					break;
				case 4:
					//최대값 구하기
					max=score[0];//첫번째 점수를 일단 max 로 지정
					//1번 데이타부터 비교후 max보다 클경우 max변경
					for(int i=1;i<score.length;i++)
					{
						if(max<score[i])
							max=score[i];
					}
					
					//총점,평균 구하기
					sum=0;
					for(int s:score)
						sum+=s;
					//평균
					avg=(double)sum/inwon;
					System.out.println("** 성적 분석 결과 **");
					System.out.println("최고점수 : "+max);
					System.out.println("합 계 : "+sum);
					System.out.printf("평 균 : %5.2f\n",avg);					
					break;

				default:
					System.out.println("** 프로그램을 종료합니다 **");
					break Exit;
			}
			System.out.println();
		}
		
	}

}









