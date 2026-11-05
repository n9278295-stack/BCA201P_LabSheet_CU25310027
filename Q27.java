// Q27: Calculate profit or loss

class Q27 {
 public static void main(String[] args) {
  int cp=500,sp=600;
  if(sp>cp) System.out.println("Profit: "+(sp-cp));
  else if(cp>sp) System.out.println("Loss: "+(cp-sp));
  else System.out.println("No Profit No Loss");
 }
}

// Sample Output:
// Profit: 100
