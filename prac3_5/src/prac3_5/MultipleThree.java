package prac3_5;
import java.util.Scanner;

public class MultipleThree 
{
	public static void print3(int [] n)
	{
		//3의 배수 결정하여 출력
		System.out.print("3의 배수..");
		for(int i = 0;i<n.length;i++) 
		{
			if(n[i]%3 ==0)
			{//3의 배수인 경우
				System.out.print(n[i] + "  ");
			}
		}
	}
	public static int [] read()//int [] 배열을 리턴한다
	{
		Scanner scanner = new Scanner(System.in);
		//배열 선언
		int [] n= new int [10];//변수 n을 선언
		
		//10개 입력
		System.out.print("양의 정수 입력>>");
		for(int i = 0;i<n.length;i++)
		{
			int k = scanner.nextInt();
			n[i] = k;
		}
		scanner.close();
		
		return n;
	}
	public static void main(String [] args) 
	{
		int [] n = read();
		print3(n);
	}
}
