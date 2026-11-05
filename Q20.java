// Q20: Check age and gender eligibility using given criteria

class Q20 {
 public static void main(String[] args) {
  int age=22;
  char gender='M';
  if(gender=='M' && age>=21) System.out.println("Eligible");
  else if(gender=='F' && age>=18) System.out.println("Eligible");
  else System.out.println("Not Eligible");
 }
}

// Sample Output:
// Eligible
