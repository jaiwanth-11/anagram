package programs;
import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b=sc.nextInt();
		int i;
		for(i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++) {
			if(a[i]==b) {
				break;
			}
			else {
			System.out.println(a[i]);
			}
		}
}
}
