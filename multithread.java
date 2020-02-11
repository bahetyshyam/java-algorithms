import java.util.Random;

class Second implements Runnable{
	public int x;
	public Second(int x) {
		this.x=x;
	}
	public void run(){
		System.out.println("second thread:square of num"+x*x);
		
	}
}
class third implements Runnable{
	public int x;
	public third(int x) {
		this.x=x;
		
	}
	public void run(){
		System.out.println("third thread:cude of a num"+x*x*x);
		
	}
}
class first extends Thread{
	public void run() {
	int num=0;
	Random r=new Random();
	
	try
	{
		for(;;)
		{
			num=r.nextInt(100);
			System.out.println("first generated num is"+num);
			
			Thread t2=new Thread(new Second(num));
			t2.start();
			Thread t3=new Thread(new third(num));
			t3.start();
			Thread.sleep(1000);
			
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}
}

public class multithread {
public static void main(String args[]) {
	first a=new first();
	a.start();
}
}
