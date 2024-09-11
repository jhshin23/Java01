package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DevideByZero {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while(true)
		{

			System.out.print(">>");;
			int d = scanner.nextInt();
			
			System.out.print(">>");
			
			try
			{
				int c = scanner.nextInt();
				int res = d/c;
				System.out.println(d + "를" + c + "로 나누면" + res );
				break;
			}
			catch(ArithmeticException e)
			{
				System.out.println("0으로 나눌 수 없습니다");
			}
			catch(InputMismatchException e)
			{
				System.out.println("아라빅 숫자로 입력해주세요");
				scanner.nextLine();
			}
		}
	}
}
