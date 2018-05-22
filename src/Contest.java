import java.util.Scanner;

public class Contest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String[] split = input.split("\\s+");
		int[] pinList = new int[split.length];
		int i = 0;
		for (String string : split) {
			pinList[i++] = Integer.parseInt(string);
		}

		System.out.println("1. " + one(pinList));
		System.out.println("2. " + two(pinList));
		System.out.println("3. " + three(pinList));
		System.out.println("4. " + four(pinList));
		System.out.println("5. " + five(pinList));
		System.out.println("6. " + six(pinList));
	}

	public static int one(int[] pinList) {
		int sum = 0;
		for (int i = 0; i < pinList.length; i++) {
			sum += pinList[i];
		}
		return sum;
	}

	public static int two(int[] pinList) {
		int count = 0;
		for (int i = 0; i < pinList.length; i++) {
			if (pinList[i] == 10) {
				count++;
			}
		}
		return count;
	}

	public static int three(int[] pinList) {
		if (pinList[0] == 10) {
			return pinList[0] + pinList[1] + pinList[2];
		} else if (pinList[0] + pinList[1] == 10) {
			return 10 + pinList[2];
		} else {
			return pinList[0] + pinList[1];
		}
	}

	public static double four(int[] pinList) {
		int sum = 0;
		int frameCount = 0;
		int i = 0;
		while (frameCount < 10) {
			if (pinList[i] == 10 && pinList[i + 1] != 0) {
				sum += 10;
				i++;
			} else {
				sum += pinList[i];
				i += 2;
			}
			frameCount++;
		}
		return ((int) (sum * 1.0 / 10 * 10)) / 10.0;
	}
	
	public static int five(int[] pinList) {
		int spareCount = 0;
		int frameCount = 0;
		int i = 0;
		while (frameCount < 10) {
			if (pinList[i] == 10 && pinList[i + 1] != 0) {
				i++;
			} else {
				if(pinList[i] + pinList[i + 1] == 10){
					spareCount++;
				}
				i += 2;
			}
			frameCount++;
		}
		return spareCount;
	}
	
	public static int six(int[] pinList) {
		int finalScore = 0;
		int frameCount = 0;
		int i = 0;
		while (frameCount < 9) {
			if (pinList[i] == 10 && pinList[i + 1] != 0) {
				finalScore += pinList[i] + pinList[i + 1] + pinList[i + 2];
				i++;
			} else {
				if(pinList[i] + pinList[i + 1] == 10){
					finalScore += pinList[i] + pinList[i + 1] + pinList[i + 2];
				}else{
					finalScore += pinList[i] + pinList[i + 1];
				}
				i += 2;
			}
			frameCount++;
		}
		if (pinList[i] == 10 && pinList[i + 1] != 0) {
			finalScore += pinList[i] + pinList[i + 1] + pinList[i + 2];
		} else {
			if(pinList[i] + pinList[i + 1] == 10){
				finalScore += pinList[i] + pinList[i + 1] + pinList[i + 2];
			}else{
				finalScore += pinList[i] + pinList[i + 1];
			}
		}
		return finalScore;
	}
}