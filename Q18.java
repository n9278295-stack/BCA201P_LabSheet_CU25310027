// Q18: Check prime number

class Q18 {
 public static void main(String[] args) {
  int n=7,i;
  for(i=2;i<n;i++) if(n%i==0) break;
  if(n>1 && i==n) System.out.println("Prime");
  else System.out.println("Not Prime");
 }
}

// Sample Output:
// Prime
