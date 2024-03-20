package day0320;

public class Ex7_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data= {23,100,200,-13,67,-123,78,345,3,110,450,-600,1200};
		int max,min;
		max=min=data[0];//무조건 첫데이타를 max또는 min 지정
		System.out.println(data.length);
		
		for(int i=1;i<data.length;i++)
		{
			if(max<data[i])
				max=data[i];
			
			if(min>data[i])
				min=data[i];
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
		int pcnt=0,mcnt=0;
		//배열데이타중 양수의갯수와 음수의갯수를 구하여서 출력해보시오
		for(int i=0;i<data.length;i++)
		{
			if(data[i]>0)
				pcnt++;
			else if(data[i]<0)
				mcnt++;
		}
		System.out.println("양수갯수:"+pcnt);
		System.out.println("음수갯수:"+mcnt);
		
		
	}

}





















