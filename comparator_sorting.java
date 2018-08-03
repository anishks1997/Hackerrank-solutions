
import java.util.*;

	class Player
	{
		String name;

		int score;

		Player(String name, int score)
		{
			this.name = name;

			this.score = score;
		}
	}

	class Checker implements Comparator<Player> 
	{
		public int compare_func(Player a, Player b)
		{
			int answer = 0;

			if(a.score > b.score)
			{
				answer = -1;
			}
			else if(a.score == b.score)
			{
				int i = 0;

				int len_a = a.name.length();

				int len_b = b.name.length();

				int comp_len = 0;

				if(len_a > len_b)
				{
					comp_len = len_b;
				}
				else
				{
					comp_len = len_a;
				}

				while(i < comp_len)
				{
					if((int) a.name.charAt(i) > (int) b.name.charAt(i))
					{
						answer = 1;

						break;
					}
					else if((int) a.name.charAt(i) < (int) b.name.charAt(i))
					{
						answer = -1;

						break;
					}
					else
					{
						i++;
					}
				}
			}
			else
			{
				answer = 1;
			}

			return answer;
		}
	}

	public class comparator_sorting
	{

		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);

			int n = scan.nextInt();

			Player[] player = new Player[n];

			Checker checker = new Checker();

			for(int i = 0; i < n; i++)
			{
				player[i] = new Player(scan.next(), scan.nextInt());
			}

			scan.close();

			Arrays.sort(player, checker);

			for(int i = 0; i < player.length; i++)
			{
				System.out.printf("%s %s\n", player[i].name, player[i].score);
			}
		}
	}
