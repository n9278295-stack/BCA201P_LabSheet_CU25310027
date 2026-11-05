// Q25: Perform logical operation using character

class Q25 {
 public static void main(String[] args) {
  int a=10,b=5;
  char op='&';
  if(op=='&') System.out.println(a>0 && b>0);
  else if(op=='|') System.out.println(a>0 || b>0);
  else System.out.println("Invalid");
 }
}

// Sample Output:
// true
