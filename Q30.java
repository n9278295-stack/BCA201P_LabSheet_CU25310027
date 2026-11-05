// Q30: Simple calculator using if-else

class Q30 {
 public static void main(String[] args) {
  int a=20,b=10;
  char op='*';
  if(op=='+') System.out.println(a+b);
  else if(op=='-') System.out.println(a-b);
  else if(op=='*') System.out.println(a*b);
  else if(op=='/' && b!=0) System.out.println(a/b);
  else System.out.println("Invalid");
 }
}

// Sample Output:
// 200
