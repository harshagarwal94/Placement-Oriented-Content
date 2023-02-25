

class demo
{
    static int Karatsuba(int X,int Y)
    {
        System.out.println("Karatsuba("+X+","+Y+")");
        if(X<10 && Y<10)
        {
            return X*Y;
        }
        else
        {
            int xlength = Integer.toString(X).length();
            int ylength = Integer.toString(Y).length();
            int n = (xlength>=ylength)? xlength : ylength;
            int halfN = n/2;
            int a = X /(int)Math.pow(10, halfN);
            int b = X %(int)Math.pow(10, halfN);
            int c = Y /(int)Math.pow(10, halfN);
            int d = Y %(int)Math.pow(10, halfN);
            int ac = Karatsuba(a, c);
            int bd = Karatsuba(b, d);
            int ad_plus_bc = Karatsuba(a+b, c+d) - ac - bd;
            return ac*(int)Math.pow(10, 2*halfN) + (ad_plus_bc) * (int)Math.pow(10, halfN) + bd;
        }
    }
    public static void main(String[] args) 
    {
        int X = 1234;
        int Y = 5678;
        System.out.println(Karatsuba(X, Y));
    }
}
