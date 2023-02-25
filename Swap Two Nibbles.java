classdemo2
{
publicstaticvoidmain(String[] args) 
  {
inta=84;
System.out.println("Original Number : "+Integer.toBinaryString(a));
intleftNibble=a&240;
intrightNibble=a&15;
System.out.println("Left Nibble : "+leftNibble+" : "+Integer.toBinaryString(leftNibble));
System.out.println("Right Nibble : "+rightNibble+" : "+Integer.toBinaryString(rightNibble));
leftNibble=leftNibble>>4;
rightNibble=rightNibble<<4;
System.out.println("After Nibble Swap : "+ (leftNibble|rightNibble));
  }
}
