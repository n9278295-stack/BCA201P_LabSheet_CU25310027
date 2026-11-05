// Q28: Count number of digits

class Q28 {
 public static void main(String[] args) {
  int n=12345,c=0;
  n=Math.abs(n);
  do { c++; n/=10; } while(n>0);
  System.out.println(c);
 }
}

// Sample Output:
// 5
