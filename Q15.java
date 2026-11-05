// Q15: Check Armstrong number (three-digit)

class Q15 {
 public static void main(String[] args) {
  int n=153,t=n,s=0;
  while(t>0) {
   int r=t%10;
   s+=r*r*r;
   t/=10;
  }
  if(s==n) System.out.println("Armstrong");
  else System.out.println("Not Armstrong");
 }
}

// Sample Output:
// Armstrong
