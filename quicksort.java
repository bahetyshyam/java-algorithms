import java.util.Random;
import java.util.Scanner;
public class quicksort {
	final static int max=100005;
	static int a[]= new int[max];

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		Random random= new Random();
		for(int i=0;i<n;i++)
			a[i]=5000+random.nextInt(100);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		long StartTime=System.nanoTime();
		quicksortalg(0,n-1);
		long StopTime=System.nanoTime();
		long elapsedTime=StopTime-StartTime;
		System.out.println("the sorted array is \n");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		System.out.println("time complexity in(ms) for "+n+" is"+(double)elapsedTime/1000000);
	}
		public static void quicksortalg(int p,int r)
		{
			int i,j,temp, pivot;
			if(p<r)
			{
				i=p;
				j=r;
				pivot=a[p];
				while(true)
				{
					i++;
					while(a[i]<pivot&&i<r)
						i++;
					while(a[j]>pivot)
						j--;
					if(i<j)
					{
						temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
					else
						break;
				}
				a[p]=a[j];
				a[j]=pivot;
				quicksortalg(p,j-1);
				quicksortalg(j+1,r);
			}
		}
}