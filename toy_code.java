
// INTERVIEW PREPARATION KIT

// MARK AND TOYS

// SORTING

import java.util.*;

public class toy_code{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int n, k ;

		n = scan.nextInt();

		k = scan.nextInt();

		int[] price = new price[n];

		for(int i = 0; i < n; i++)
		{
			price[i] = scan.nextInt();
		}

		int result = max_toy(price, k);

		System.out.println(result);

		return result;

	}

	// Using insertion sort algorithm

	public static int max_toy(int[] price, int k)
	{
		int size = price.length;

		for(int i = 1; i < size; i++)
		{
			int key_val = price[i];

			int j = i - 1;

			while(j >= 0 && price[j] > key_val)
			{
				price[j + 1] = price[j];

				j = j - 1;
			}

			price[j + 1] = key_val;
		}

		int balance = k;

		int toy_counter  = 0;

		for(int i = 0; i < size; i++)
		{
			balance = balance - price[i];

			toy_counter++;

			if(balance < price[i + 1])
			{
				break;
			}
		}

		return toy_counter;
	}
}