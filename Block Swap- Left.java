// Block Swap - Left
class demo 
{
  static void swap(int arr[], int first , int second , int size)
  {
    int temp = 0;
    for(int i=0;i<size;i++)
    {
      temp = arr[first + i];
      arr[first + i] = arr[second + i];
      arr[second + i] = temp;
    }
  }

  static void blockSwap(int arr[], int d)
  {
    int A = d , B = arr.length - d;
    while(A!=B)
    {
      if(A<B) // A is smaller
      {
        // swap B-Right and A 
        swap(arr, d-A , d+B-A , A);
        B = B - A; 
      }
      else  // B is smaller
      {
        // swap A-Left and B
        swap(arr, d-A ,d, B);
        A = A - B; 
      }
    }
    swap(arr, d-A, d, A);
  }
  public static void main(String[] args) 
  {
    int arr[] = new int[] {10,20,30,40,50,60,70};
    int position = 3;
    blockSwap(arr, position);
    for(int i : arr)
    {
      System.out.print(i+" ");
    }
  }
}
