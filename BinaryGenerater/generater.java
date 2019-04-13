//Generate binary numbers from 1 to n using a queue

import java.util.ArrayDeque;
import java.util.Queue;
class Main
{
	public static void generate(int n)
	{
		Queue<String> q = new ArrayDeque<>();
		q.add("1");

		int i = 1;
		while (i++ <= n)
		{
			q.add(q.peek() + "0");
			q.add(q.peek() + "1");
			System.out.print(q.poll() + ' ');
		}
	}

	public static void main(String[] args)
	{
		int n = 16;
		generate(n);
	}
}
