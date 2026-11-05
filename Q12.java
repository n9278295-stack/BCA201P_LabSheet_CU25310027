// Q12: Check leap year

class Q12 {
 public static void main(String[] args) {
  int y=2024;
  if(y%400==0 || (y%4==0 && y%100!=0)) System.out.println("Leap Year");
  else System.out.println("Not Leap Year");
 }
}

// Sample Output:
// Leap Year
