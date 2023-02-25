  /*Problem Statement : Given two Arrays such that div[n] and rem[n],Every pair is co-prime. 
    find minimum value of 'x' such that 
 
    X % div[0] = rem[0]
    X % div[1] = rem[1]
    X % div[2] = rem[2]
    .
    .
    .
    X % div[n-1] = rem[n-1]
 
*/
class demo
{
    public static void main(String[] args) 
    {
        int[] div = new int[] {3,4,5,13};
        int[] rem = new int[] {2,3,1,1};
       
 
        for(int i=0;i<div.length;i++)
        {
            System.out.println("div : " + div[i] + " rem : " + rem[i]);
        }
 
        int X = 1;
        boolean flag = true;
        while(true)
        {
            flag = true;
            for(int i=0;i<div.length;i++)
            {
                if(X%div[i]!=rem[i])
                {
                    System.out.println(X + " doesnt give remainder " + rem[i] + " when divided by " + div[i] );
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println("X : " + X);
                break;
            }
            X++;
        }
 
    }
}
