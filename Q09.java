// Q09: Calculate total, percentage and pass/fail

class Q09 {
 public static void main(String[] args) {
  int a=60,b=70,c=80;
  int total=a+b+c;
  double per=total/3.0;
  System.out.println(total);
  System.out.println(per);
  if(a>=40 && b>=40 && c>=40) System.out.println("Pass");
  else System.out.println("Fail");
 }
}

// Sample Output:
// 210\n70.0\nPass
