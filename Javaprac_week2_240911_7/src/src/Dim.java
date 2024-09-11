package src;

public class Dim 
{

	public static void print(int n[][])
	{
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n[i].length;j++)
			{
				System.out.print(n[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static int [][] makeArray(int rows) 
	{
		int n[][];//레퍼런스 변수 n선언
		
		n = new int [rows][];
		n[0] = new int [3];
		n[1] = new int [5];
		n[2] = new int [2];
		n[3] = new int [3];
				
		for(int i=0;i<n.length;i++)
		{
			for(int j = 0;j<n[i].length;j++)
			{
				int k = (int)(Math.random()*100) + 1;
				n[i][j] = k;
			}
		}
		return n;
	}
	
	public static void main(String[] args)
	{
		print(makeArray(4));
	}
}
