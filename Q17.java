// Q17: Check palindrome number

class Q17 {
 public static void main(String[] args) {
  int n=121,t=n,r=0;
  while(t>0) {
   r=r*10+t%10;
   t/=10;
  }
  if(n==r) System.out.println("Palindrome");
  else System.out.println("Not Palindrome");
 }
}

// Sample Output:
// Palindrome
