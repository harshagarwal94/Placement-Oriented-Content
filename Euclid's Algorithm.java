// Euclidean Algorithm
classdemo
{
publicstaticvoidmain(String[] args) 
    {
inta=2096; // larger
intb=5184; // smaller
System.out.println("A : "+a+" B : "+b);
while(b!=0)
        {
inttemp=b;
b=a%b;
a=temp;   
System.out.println("A : "+a+" B : "+b);       
        }
System.out.println("GCD : "+a);
    }
}
