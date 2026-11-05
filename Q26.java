// Q26: Compare first and last digits of a five-digit number

class Q26 {
 public static void main(String[] args) {
  int n=12341;
  int first=n/10000,last=n%10;
  if(first==last) System.out.println("Same");
  else System.out.println("Not Same");
 }
}

// Sample Output:
// Same
