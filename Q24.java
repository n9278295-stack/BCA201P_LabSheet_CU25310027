// Q24: Check perfect number

class Q24 {
 public static void main(String[] args) {
  int n=6,s=0;
  for(int i=1;i<n;i++) if(n%i==0) s+=i;
  if(s==n) System.out.println("Perfect");
  else System.out.println("Not Perfect");
 }
}

// Sample Output:
// Perfect
