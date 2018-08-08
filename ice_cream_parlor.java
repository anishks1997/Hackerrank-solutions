
import java.util.*;

public class ice_cream_parlor
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		while(t > 0)
		{
			int money = scan.nextInt();

			int n = scan.nextInt();

			int[] cost = new int[n];

			for(int i = 0; i < n; i++)
			{
				cost[i] = scan.nextInt();
			}

			t--;
		}

		icecreamchoice(cost, money);

		scan.close();
	}

	public static void icecreamchoice(int[] cost, int money)
	{
		int len = cost.length;

		int temp_val = money;

		int smaller_index = 0;

		int larger_index = 1;

		int found = 0;

		for(int i = 0; i < len - 1; i++)
		{
			for(int j = i + 1; j < len; j++)
			{
				if(cost[i] + cost[j] == temp_val)
				{
					smaller_index = i + 1;

					larger_index = j + 1;

					found = 1;

					break;
				}
			}

			if(found == 1)
			{
				break;
			}
		}

		System.out.println(smaller_index + " " + larger_index);
	}
}