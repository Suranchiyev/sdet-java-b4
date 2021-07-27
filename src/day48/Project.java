package day48;

public class Project  {
	public static void main(String[] args) {
	  // Invalid inouts
      if (args == null || args.length < 2 || !isNumeric(args[0]) || Integer.parseInt(args[0]) < 0) {
      	System.out.println("Usage: java Project key plaintext");
        return;
      }
      
      int key = Integer.parseInt(args[0]);
      String txt = args[1];
      String cipher = "";
      
      String lower = "abcdefghijklmnopqrstuvwxyz";
      String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      
      for (char ch : txt.toCharArray()) {
      	 int c = 0;
         char cipherCh;
        
         if (ch >= 65 && ch <= 90) {
         	c = (upper.indexOf(ch) + key) % 26;
            cipherCh = upper.charAt(c);
         } else if (ch >= 97 && ch <= 122) {
         	c = (lower.indexOf(ch) + key) % 26;
            cipherCh = lower.charAt(c);
         } else {
            cipherCh = ch;
         }
         
         cipher += cipherCh;
      }
      
      System.out.println("ciphertext: " + cipher);

    }
  
    public static boolean isNumeric(String str) {
    	try {
        	int num = Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}