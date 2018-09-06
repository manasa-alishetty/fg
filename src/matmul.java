import java.util.Scanner;
public class matmul {

	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("enter size");
		int r=obj.nextInt();
		System.out.println("enter size");
		int c=obj.nextInt();
		int[][] a=new int[r][c];
		System.out.println("ënter values");
		int[][] d=new int[r][c];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		System.out.println("enter size");
		int r1=obj.nextInt();
		System.out.println("enter size");
		int c1=obj.nextInt();
		System.out.println("enter values");
		int[][] b=new int[r1][c1];
		for(int i=0;i<=b.length-1;i++)
		{
			for(int j=0;j<=b[i].length-1;j++)
			{
				b[i][j]=obj.nextInt();
			}
		}
		if(c==r1)
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					for(int k=0;k<b.length;k++)
					{
						d[i][j]=d[i][j]+a[i][k]*b[k][j];
					}
				}
			}
		}
		else
		{
			System.out.println("not possible");
		}
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				System.out.println(d[i][j]);
			}
		}
	}
}
