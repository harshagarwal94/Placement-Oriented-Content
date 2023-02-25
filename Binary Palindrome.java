// Binary Palindrome
class demo
{
    public static void main(String[] args) 
    {
        int a = 1214;
        int b = 2;
        int temp1 = a;
        int temp2 = b;
        int carry = 0;
        while(b!=0)
        {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        System.out.println(temp1 + " + " + temp2 + " = " + a);
    }
}
