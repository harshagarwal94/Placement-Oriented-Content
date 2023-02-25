/*In a garden, there are several apple trees planted in a grid format. Each point (i, j) in the grid has | i | + | j | apples. Alice can buy a square plot centered at (0, 0). Find the minimum perimeter of the plot (1 unit having length = 1) such that she can collect at least X apples. All plants on the perimeter of the plot are also included.



Format:

Input:

X denotes the number of apples Alice has to collect.

Output:

Your function should return the minimum perimeter of the plot, which should be bought by Alice.



Code : 

*/
import java.util.*;

class Main {
static int find(int apples){
  int sum=0;
  int x[]=new int[] {-1,-1,-1,0,0,1,1,1};
  int y[]=new int[] {-1,0,1,-1,1,-1,0,1};
  for(int i=0;i<8;i++)
  {
    x[i]=x[i]<0?(x[i]*=-1):x[i];
    y[i]=y[i]<0?(y[i]*=-1):y[i];
  }
  int factor =1;
  while(sum<apples)
  {
    for(int i=0;i<8;i++)
    {
      	sum+=x[i]+y[i];
    }
    if(sum>=apples) break;
    ++factor;
    for(int i=0;i<8;i++)
    {
      	x[i]*=factor;
      	y[i]*=factor;
    }
  }
  return factor<<3;
}
    


	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int apples=sc.nextInt();
		System.out.println(find(apples));
	}
}
