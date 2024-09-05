package programs;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Operations {
	public static void main(String[]args) {
		List<List<Integer>> hello=new ArrayList<>();
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
		      List<Integer> value=new ArrayList<>(Arrays.asList(i,j));
		      hello.add(value);
			}
		}
		System.out.print(hello);
		hello.remove(0);
		System.out.println();
		System.out.print(hello);
}
}
