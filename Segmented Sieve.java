class demo3
{
    static int simpleSieve(int Num, int neededPrimes[])
    {

		boolean[] sieve = new boolean[Num+1];
        //Arrays.fill(sieve,true); // we assume all numbers are prime intially
		for(int i=0;i<=Num;i++)
		{
			sieve[i] = true;
		}

        for(int currNum =2;currNum<=Math.sqrt(Num);currNum++)
        {
            if(sieve[currNum]==true) // if the currNum is prime , then remove 
            {
                // move in multiples of 'currNum' from index currNum^2
                for(int multiple = currNum*currNum ; multiple<Num; multiple = multiple+currNum)
                {
                    sieve[multiple] = false;
                }
            }
        }
		int counter = 0;
        for(int i=2;i<Num;i++)
        {
            if(sieve[i]==true)
            {
				neededPrimes[counter] = i ;
				counter++;
            }
        }
        return counter;
    }

	static void segmentedSieve(int num)
	{	
		int segSize = (int)Math.sqrt(num);
		System.out.println(segSize + " Segments , each with " + segSize + " Elements");
		int[] neededPrimes = new int[segSize]; // stores prime number in the range of 2 to sqrt(num)
		int noOfPrimes = 0;
        noOfPrimes = simpleSieve(segSize, neededPrimes); 
		for(int a : neededPrimes)
		{
            if(a==0)
            {
                break;
            }
			System.out.println(a);
		}
        System.out.println("Number of Primes in the First segment : " + noOfPrimes);


        int lowerBound = segSize + 1 ;
        int higherBound = lowerBound + segSize - 1;


        boolean segSieve[] = new boolean[segSize];
        

        while(lowerBound<=num)
        {
            Arrays.fill(segSieve, true);
            System.out.println("\nlow : " + lowerBound + " High : " + higherBound);
            // find all primes from lowerBound to UpperBound

            for(int index = 0;index<noOfPrimes;index++)
            {
                int currPrime = neededPrimes[index];
                int lowestMultiple = lowerBound/currPrime * currPrime;
                if(lowestMultiple<lowerBound)
                {
                    lowestMultiple = lowestMultiple + currPrime;
                }
                System.out.print("Lowest Mulitple for " + currPrime + " in the segment is " + lowestMultiple);
                for(int i = lowestMultiple ; i<=higherBound ; i = i + currPrime)
                {
                    segSieve[i-lowerBound] = false;
                    System.out.print(" "+i);
                }
                System.out.println();
            }

            // print primes in range
            System.out.print("Primes in range ("+lowerBound+","+higherBound+") : ");
            for(int  i=lowerBound ; i<=higherBound ; i++)
            {
                if(segSieve[i-lowerBound] == true)
                {
                    System.out.print(i+" ");
                }
            }
            System.out.println();


            //
            lowerBound = lowerBound + segSize;
            higherBound = higherBound + segSize;
            if(higherBound>num)
            {
                higherBound = num;
            }
        }
	}
    public static void main(String[] args) 
    {
       int N = 100;
       System.out.println("Num ==> " + N);
       segmentedSieve(N);
    }
}
