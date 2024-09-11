import java.util.InputMismatchException;
import java.util.Scanner;

public class CoffeeOrder 
{
	public static void main(String[] args)
	{
		//2개의 배열 선언
		String [] coffee = {"핫", "아아","카푸치노", "라떼"};
		int price[] = {3000, 3500, 4000, 5000};
		
		//커피 목록 출력
		for(int i = 0;i<coffee.length;i++)
		{
			System.out.print(coffee[i] + " ");
		}
		System.out.println("있습니다");
		//루프
		Scanner scanner = new Scanner(System.in);
		while(true)
		{		
			//출력
			System.out.print("주문>>");
			//주문 받기
			String order = scanner.next();
			int count = 0;

			try {
				count = scanner.nextInt();

				}
			catch(InputMismatchException e) {
				System.out.println("주문 수량은 양수를 입력해주세요");
				scanner.nextLine();
				continue;
			}
			//그만 체크
			if(order.equals("그만"))
				break;
			//가격 결정 후 출력
			int sum = 0;
			boolean found = false;
			for(int i=0;i<coffee.length;i++)
			{
				if(order.equals(coffee[i])) {
					sum = price[i] * count;
					found = true;
					break;
				}
			}
			if(found)
				System.out.println("가격은 " + sum + "원입니다.");
			else
				System.out.println(order + "는 없는 메뉴입니다");
		}


		

	}
}
