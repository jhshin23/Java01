package src;

import java.util.Scanner;

public class ex3_7 {
	
	public static int getBig(int nArray[])
	{
		int big = nArray[0];

		for(int n: nArray)
		{
			if(big < n)
				big = n;
		}
		return big;
	}
	
	public static void main(String[] args)
	{/*
	main - intArray, nArray 그리고 getBig - nArray가 같은 객체를 가리킨다
	getBig이 리턴하고 나면 그 안의 변수들이 사라지지만 객체는 그대로 남아있다
	*/
		//변수 n 선언
		int intArray[];//=int [] intArray;
		intArray = new int [5];//강의자료 3장의 그림과 같음
		
		System.out.println("정수 " + intArray.length + "개 입력");
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i<intArray.length;i++)
		{
			int n = scanner.nextInt();
			intArray[i] = n;
		}
		
		int [] nArray = intArray;//복사하는 것이 아님. 두 변수가 같은 객체를 함께 가리킴.
		//배열을 공유한다
		
		int big = getBig(nArray);
		
//		for(int i = 0;i<intArray.length;i++)
//		{
//			if(big < intArray[i])
//				big = intArray[i];
//		}
		
		System.out.println("가장 큰 수는 " + big);
		scanner.close();
	}
}
