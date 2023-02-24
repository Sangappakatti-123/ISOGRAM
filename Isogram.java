package list1;

public class Isogram {
 public static void  main(String[] args) {
	String s1="sanguu";
	System.out.println(check(s1));
 }
 public static String check(String s1) {
	 for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					return "no";
				}
			}
		}
		return "yes";
 }
}
