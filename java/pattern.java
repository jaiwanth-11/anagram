package programs;
import java.util.*;
public class Reverse {
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 int n=6;
	 int k=1;
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j<=2*i-1;j++) {
			 if(j<=((2*i)-1) && j<=i) {
        System.out.print(1);
		 }
			 else {
				 k++;
				 System.out.print(k);}
			 }k=1;System.out.println();
	 }
 }
}

