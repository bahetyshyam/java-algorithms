import java.util.Scanner;
public class pushpop{
	static int top=-1;
	static int MAX=5;
	static int a[]=new int[MAX];
	static Scanner scan=new Scanner(System.in);
	public static void main(String args[])
	{
		int choice;
		do
		{
			System.out.println("Enter an option");
			System.out.println("1.Push 2.Pop 3.Display 4.Exit");
			choice=scan.nextInt();
			switch(choice)
			{
			case 1:push();
			break;
			case 2:pop();
			break;
			case 3:display();
			break;
			default:System.exit(0);
			}
		}
		while(choice<=3);
	}
	
	static void push()
	{
		int e;
		if(top==MAX-1)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			top++;
			System.out.println("Enter element");
			e=scan.nextInt();
			a[top]=e;
		}
		return;
	}
	
	static void pop()
	{
		if(top==-1)
		{
			System.out.println("Stcak underflow");
		}
		else
		{
			top--;
		}
		return;
	}
	
	static void display()
	{
		int i;
		if(top==-1)
		{
			System.out.println("No elements in the stack");
		}
		else
		{
			for(i=top;i>=0;i--)
				System.out.println(a[i]);
		}
		return;
	}
}