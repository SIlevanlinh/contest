import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();	

		char[] c = s.toCharArray();
		Arrays.sort(c);
		
		int count = 0;
		int tempCount = 0;
		for (int i = 0; i < c.length - 1; i++) {
			if ((int)c[i] == (int)c[i + 1]) {
				tempCount++;
				System.out.println("tempCount = " + tempCount + "c[i] " + c[i]);
			} else if ((int)c[i] + 1 == (int)c[i + 1]) {
				count += tempCount + 1;
				tempCount = 0;
			}
		}
		
		System.out.println(c);
		System.out.println(count);

	}

}

