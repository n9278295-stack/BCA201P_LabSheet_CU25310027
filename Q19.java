// Q19: Perform arithmetic operation using operator

class Q19 {
 public static void main(String[] args) {
  int a=10,b=5;
  char op='+';
  if(op=='+') System.out.println(a+b);
  else if(op=='-') System.out.println(a-b);
  else if(op=='*') System.out.println(a*b);
  else if(op=='/' && b!=0) System.out.println(a/b);
  else System.out.println("Invalid");
 }
}

// Sample Output:
// 15
