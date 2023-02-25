classdemo
{
publicstaticvoidmain(String[] args) 
  {
intnumber=15 ;
System.out.println(Integer.toBinaryString(number));
intcurrLength=0, prevLength=0, maxLength=0;
// currLength : stores the length of the current longest sequence
// prevLength : stores the length of the previous longest sequence which is seperated by a single '0'
// maxLength : 
while(number!=0)
    {
if((number&1)==1)
      {
currLength++;
      } 
else
      {
if((number&2)==0) // check the two sequences of 1's are seperated by a single 0 
        {
prevLength=0;
currLength=0;
        }
else
        {
prevLength=currLength;
currLength=0; 
        }
      }
if((prevLength+currLength)>maxLength)
      {
maxLength=prevLength+currLength;
      }
number=number>>1;
    }
System.out.println("Longest Sequence = "+ (maxLength+1));
  }
}
