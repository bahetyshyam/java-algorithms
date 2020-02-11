import java.util.*;

public class crc {

	public static void main(String args[]) throws Exception {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of bits in the Message");
		int mb = in.nextInt();
		System.out.println("Enter the Message bits");
		int m[] = new int[mb];
		for (int i = 0; i < mb; i++)
			m[i] = in.nextInt();

		System.out.println("Enter the number of bits in the Generator");
		int gb = in.nextInt();
		System.out.println("Enter the Generator bits");
		int g[] = new int[gb];
		for (int i = 0; i < gb; i++)
			g[i] = in.nextInt();

		int tb = mb + gb - 1;

		int am[] = new int[tb];
		int tm[] = new int[tb];
		int rem[] = new int[tb];

		for (int i = 0; i < mb; i++)
			am[i] = m[i];

		for (int i = 0; i < tb; i++)
			rem[i] = am[i];

		rem = computecrc(g, am, rem);

		for (int i = 0; i < tb; i++)
			tm[i] = am[i] ^ rem[i];

		System.out.println("Enter the Received bits");
		int rm[] = new int[tb];
		for (int i = 0; i < tb; i++)
			rm[i] = in.nextInt();

		for (int i = 0; i < tb; i++)
			rem[i] = rm[i];

		rem = computecrc(g, am, rem);

		for (int i = 0; i < tb; i++) {
			if (rem[i] != 0) {
				System.out.println("Error in the received message");
				break;
			} 
			else if(i==rem.length-1)
				System.out.println("No Error in the received message");

		}

		in.close();

	}

	public static int[] computecrc(int g[], int am[], int rem[]) {

		int a = 0;

		while (true) {

			for (int i = 0; i < g.length; i++)
				rem[a + i] = rem[a + i] ^ g[i];
			while (rem[a] == 0 && a != rem.length - 1)
				a++;
			if ((rem.length - a) < g.length)
				break;

		}

		return rem;

	}
}
