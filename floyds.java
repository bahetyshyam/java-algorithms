import java.util.Scanner;
public class floyds {
	static final int MAX=20;
	static int a[][],n;
	
	public static void main(String args[])
	{
		a=new int[MAX][MAX];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		n=scan.nextInt();
		System.out.println("Enter the matrix");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				a[i][j]=scan.nextInt();
		scan.close();
		floydsalgo();
		printmatrix();
	}
	
	private static void printmatrix()
	{
		System.out.println("The all shortest distant paths are");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				{
					System.out.print(a[i][j]+"\t");
				}
			System.out.println();
		}
	}
	
	static void floydsalgo()
	{
		for(int k=1;k<=n;k++)
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					if((a[i][k]+a[k][j])<a[i][j])
						a[i][j]=a[i][k]+a[k][j];
	}
}
