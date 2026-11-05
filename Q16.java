// Q16: Calculate tax using given slabs

class Q16 {
 public static void main(String[] args) {
  double s=600000,tax;
  if(s<=250000) tax=0;
  else if(s<=500000) tax=s*0.05;
  else if(s<=1000000) tax=s*0.20;
  else tax=s*0.30;
  System.out.println("Tax: "+tax);
 }
}

// Sample Output:
// Tax: 120000.0
