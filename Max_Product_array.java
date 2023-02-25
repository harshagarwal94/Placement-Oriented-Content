import java.util.Arrays;

class demo4 
{
    public static void main(String[] args) 
    {
        int arr[] = new int[]{1,-5,2,3,7,10};
        Arrays.sort(arr);
        int finalMax = arr[arr.length-1];
        int currMin = 1 , currMax = 1;

        for(int i=0;i<arr.length;i++)
        {
            int value = arr[i];
            if(value==0)
            {
                currMin = 1;
                currMax = 1;
                continue;
            }
            int temp = currMax * value; // store previous value
            currMax = (int)Math.max(Math.max(value*currMin, value*currMax), value);
            currMin = (int)Math.max(Math.max(temp, value*currMin), value);
            finalMax = Math.max(finalMax, currMax);
        }
        System.out.println(finalMax);
    }
}
