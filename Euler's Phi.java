
import java.io.*;
import java.util.*;

class Main
{
	//Sum of prime factors of a given number
    static float euler(int n)
    {
        if(n == 1)
            return 1 ;
        for(int i = 2 ; i*i <= n ; i++)
        {
            if(n%i == 0)
            {
                return 1 ;
            }
        }
        return (float)(n-1)/n ;
    }
    public static void main (String[] args) 
	{
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        float prod = n ;
        for(int i = 1 ; i*i <= n ; i++)
        {
            if(i*i==n)
                prod *= euler(i) ;
            else if(n%i == 0)
            {
                prod *= euler(i) ;
                prod *= euler(n/i) ;
            }
        }
        System.out.print((int)prod*n/2); 
    }
}
