import java.lang.*;
import java.util.*;

class Main
{
    public static void findLongestPalindromicString(String text)
    {
    	int N = text.length();
    	if(N == 0)
    		return;
    	
    	N = 2 * N + 1;
    	
    	int []L = new int [N];
    	L[0] = 0;
    	L[1] = 1;
    	
    	int C = 1;
    	
    	int R = 2;
    	
    	int i = 0;
    	
    	int iMirror;
    	int expand = -1;
    	int diff = -1;
    	int maxLPSLength = 0;
    	int maxLPSCenterPosition = 0;
    	int start = -1;
    	int end = -1;
    	
    	for (i = 2; i < N; i++)
    	{
    		iMirror = 2 * C - i;
    		
    		expand = 0;
    		diff = R - i;
    		
    		if(diff >= 0)
    		{
    			
    			if(L[iMirror] < diff)
    				L[i] = L[iMirror];
    				
    			else if(L[iMirror] == diff && R == N - 1)
    				L[i] = L[iMirror];
    			
    			else if(L[iMirror] == diff && R < N - 1)
    			{
    					L[i] = L[iMirror];
    					
    					expand = 1;
    			}
    			
    			else if(L[iMirror] > diff)
    			{
    				L[i] = diff;
    				
    				expand = 1;
    			}
    		}
    		else
    		{
    			L[i] = 0;
    			
    			expand = 1;
    		}
    		
    		if (expand == 1)
    		{
    			try
    			{
    				while (((i + L[i]) < N && (i - L[i]) > 0) &&(((i + L[i] + 1) % 2 == 0) ||(text.charAt((i + L[i] + 1) / 2) ==text.charAt((i - L[i] - 1) / 2))))
    				{
    					L[i]++;
    				}
    			}
    			catch (Exception e)
    			{
    				assert true;
    			}
    		}
    		
    		if(L[i] > maxLPSLength)
    		{
    			maxLPSLength = L[i];
    			maxLPSCenterPosition = i;
    		}
    
    		if (i + L[i] > R)
    		{
    			C = i;
    			R = i + L[i];
    		}
    		
    	}
    	
    	start = (maxLPSCenterPosition -
    			maxLPSLength) / 2;
    	end = start + maxLPSLength - 1;
    	
    	for(i = start; i <= end; i++)
    		System.out.print(text.charAt(i));
    	System.out.println();
    }
    
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
    	String text1=sc.next();
    	findLongestPalindromicString(text1);
    }
}
