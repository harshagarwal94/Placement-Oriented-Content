import java.util.Arrays;
 
class demo
{
    static void simepleSieve(int num)
    {
        boolean isPrime[] = new boolean[num+1];
        // Arrays.fill(isPrime, true);
 
        for(int i=2;i<=num;i++) // initailly assume all values as prime
        {
            isPrime[i] = true;
        }
 
        for(int currNum = 2;currNum<=Math.sqrt(num);currNum++)
        {
            if(isPrime[currNum] == true)
            {
                // if the currNum is prime , then remove all it's multiples starting from it's squared value
                for(int multiple=currNum*currNum ;multiple<=num;multiple = multiple + currNum)
                {
                    isPrime[multiple] = false;
                }
            }
        }
 
        for(int i = 2; i<=num ;i++)
        {
            if(isPrime[i])
            {
                System.out.println("Num ==> " + i +" ==> is Prime : "+isPrime[i]);
            }
        }
 
    }
    public static void main(String[] args) 
    {
        int num = 1000; // find all prime under num
        simepleSieve(num);
    }
}
