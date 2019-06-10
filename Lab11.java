
import java.util.*;

public class Lab11 {

	public static double X1() {

		int count = 0;

		while (true) {

			count++;

			Random r = new Random();

			int k = r.nextInt(3);

			if (k == 1)
				break;

		}

		return count;

	}

	public static double X2() {

		int count = 0;

		while (true) {

			count++;
			Random r = new Random();

			int k = r.nextInt(4);

			if (k == 0 || k == 1 || k == 2)

				break;

		}

		return count;

	}

	// Method for Tasks 3 - 6
	public static double generate(int value) {
		Random r = new Random();
		int n = value, x = 100000;
		double sum = 0, m = 0;
		int match;
		double temp = 0;

		for (int i = 1; i <= x; i++) {
			int one = 0;

			int two = 0;

			int three = 0;

			int four = 0;

			int five = 0;

			int six = 0;

			int seven = 0;

			int eight = 0;

			for (int j = 1; j <= n; j++) {

				int number = r.nextInt(n) + 1;
				switch (number) {
				case 1:
					match = 1;
					one += 1;
					break;
				case 2:
					match = 2;
					two += 1;
					break;
				case 3:
					match = 3;
					three += 1;
					break;
				case 4:
					match = 4;
					four += 1;
					break;
				case 5:
					match = 5;
					five += 1;
					break;
				case 6:
					match = 6;
					six += 1;
					break;
				case 7:
					match = 7;
					seven = seven + 1;
					break;
				case 8:
					match = 8;
					eight += 1;
					break;

				}
				temp = Math.pow(one, 2) + Math.pow(two, 2) + Math.pow(three, 2) + Math.pow(four, 2) + Math.pow(five, 2)
						+ Math.pow(six, 2) + Math.pow(seven, 2) + Math.pow(eight, 2);
			}
			sum += temp;
		}
		m = sum / x;
		return m;

	}

	public static double generate2(int index, int n) {

		int[] array = new int[5];

		Random r = new Random();

		double sum = 0;

		for (int iterate = 0; iterate < index; iterate++) {

			for (int i = 0; i < n; i++) {

				array[i] = r.nextInt(n);

				array[i]++;

			}

			for (int x = 1; x <= n; x++) {
				for (int y = 1; y <= n; y++) {
					for (int z = 1; z <= n; z++) {

						if (array[z - 1] == x && array[y - 1] == x)

							sum++;

					}
				}
			}
		}

		return sum / 10000;

	}

	public static void main(String[] args) {

		double total1 = 0, total2 = 0;

		for (int x = 0; x < 100000; x++) {

			total1 += X1();

			total2 += X2();

		}

		System.out.println(total1 / 100000 + " " + total2 / 100000);

		System.out.println(generate(5));
		System.out.println(generate(6));
		System.out.println(generate(7));
		System.out.println(generate(8));

		System.out.println(generate2(10000,5));
		
	

	}
}
