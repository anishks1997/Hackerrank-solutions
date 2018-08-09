
// fibonacci using recursion

public static int fibonacci(int n)
{
	 int first = 0; 

    int second = 1; 
    
    while(n > 0)
    {
        
        n = n - 1;

        int answer = fibonacci(n);

        int third = first + second;

        first = second;

        second = third;

    }
    

    return first;
      
}