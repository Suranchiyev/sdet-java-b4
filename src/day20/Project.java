package day20;

public class Project {
	public static void main(String[] args) {
    	int height = Integer.parseInt(args[0]);
      	//int height = 5;
      	String space = " ";
      	String pound = "#";
      	if (height <=0 || height >= 9) System.out.println("INVALID INPUT");
      	else {
      	for (int i=1; i<=height; i++) {
        	System.out.println(repeat((height-i), space) + repeat(i, pound) + "  " + repeat(i, pound) + repeat((height-i), space).trim());
        }
        }
    }
  
    private static String repeat(int count, String str) {
    	String res = "";
        for (int i = 0; i < count; i++){
        	res += str;
        }
        return res;
    }
}
