package topsic;
import java.util.*;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();		
		
		int boxes = 1;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i - 1)) {
				boxes++;
			}
		}
		
		System.out.println(boxes);

	}

}