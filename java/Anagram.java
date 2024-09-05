package programs;
import java.util.*;
public class Anagram {
  public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	String str1= sc.nextLine();
	String str2=sc.nextLine();
	List<String>hello=new ArrayList<>();
	for(int i=0;i<str1.length();i++) {
		for(int j=0;j<str2.length();j++) {
			if(str1.charAt(i)==str2.charAt(j)) {
				String d=Character.toString(str2.charAt(j));
				hello.add(d);
				break;
			}
		}
	}
	if(hello.size()==str1.length()) {
		System.out.print("Anagram");
	}
	else {
		System.out.print("Not Anagram");
	}
  }
}
