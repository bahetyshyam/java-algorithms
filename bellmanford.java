import java.util.*;

public class bellmanford {
	public static void main(String args[]) throws Exception {

		Scanner in = new Scanner(System.in);

		int n;

		System.out.println("Enter the number of vertices");

		n = in.nextInt();

		int w[][] = new int[n][n];

		System.out.println("Enter the weight matrix");

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				w[i][j] = in.nextInt();
				if (i == j) {
					w[i][j] = 0;
					continue;
				}
				if (w[i][j] == 0)
					w[i][j] = 999;
			}

		System.out.println("Enter the source node");

		int s = in.nextInt();

		calc(n, s, w);

		in.close();

	}

	public static void calc(int n, int s, int w[][]) {

		int d[] = new int[n];

		for (int i = 0; i < n; i++)
			d[i] = 999;

		d[s - 1] = 0;

		for (int k = 0; k < n; k++)
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					if (w[i][j] != 999)
						if (d[j] > d[i] + w[i][j])
							d[j] = d[i] + w[i][j];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (w[i][j] != 999)
					if (d[j] > d[i] + w[i][j])
						System.out.println("Graph contains negative edge cycle");

		System.out.println("The distances are");

		for (int i = 0; i < n; i++)
			System.out.println("From " + s + " to " + (i + 1) + " is " + d[i]);

	}

}
