// Q14: Identify character type

class Q14 {
 public static void main(String[] args) {
  char ch='A';
  if(Character.isDigit(ch)) System.out.println("Digit");
  else if(Character.isUpperCase(ch)) System.out.println("Uppercase");
  else if(Character.isLowerCase(ch)) System.out.println("Lowercase");
  else System.out.println("Special Character");
 }
}

// Sample Output:
// Uppercase
