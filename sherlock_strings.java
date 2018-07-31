
// UNDER THE INTERVIEW PREPARATION KIT

// CATEGORY ---> STRING MANIPULATION

// PROBLEM ---> SHERLOCK AND THE VALID STRING

import java.util.*;

public class sherlock_strings{

	public void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		String result = the_func(str);

		System.out.println(result);

		scan.close();

	}

	public static String the_func(String str)
	{
		int str_len = str.length();

		char[] dummy_arr = new char[str_len];

		for(int i = 0; i < str_len; i++)
		{
			dummy_arr[i] = str.charAt(i);
		}		

		int[] freq_tracker = new int[str_len];

		Arrays.fill(freq_tracker, 1); 

		int k = 0;

		for(int i = 0; i < str_len - 1 ; i++)
		{
			if(dummy_arr[i] == dummy_arr[i + 1])
			{
				freq_tracker[k] = freq_tracker[k] + 1;
			}
			else
			{
				k = k + 1;
			}
		}

		int compare_val = freq_tracker[0];

		boolean first_flag = true;

		int faulty_pos = 0;

		for(int i = 1; i < str_len; i++)
		{
			if(freq_tracker[i] != compare_val)
			{
				if(compare_val > freq_tracker[i])
				{
					faulty_pos = 0;
				}
				else
				{
					faulty_pos = i;
				}

				freq_tracker[faulty_pos] = freq_tracker[faulty_pos] - 1;

				if(freq_tracker[faulty_pos] != compare_val)
				{
					first_flag = false;

					break;
				}
			}

		}

		String result = "YES";

		if(first_flag == true)
			result = "YES";
		else
			result = "NO";

		return result;

		
	}
}