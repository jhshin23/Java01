package src;
import java.util.Scanner;

public class MyScanner 
{
	public static void main(String[] args)
	{	System.out.println("이름, 도시, 체중...을 입력");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean isSingle = scanner.nextBoolean();
		
		System.out.println("이름은 " + name + ", 도시는 " + city + ", 체중은" + weight + ", 독신 여부는 " + isSingle);
		
		scanner.close();
	}
}
