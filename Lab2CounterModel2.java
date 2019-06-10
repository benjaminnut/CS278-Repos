
public class Lab2CounterModel2 {
	static boolean[][] P = { { false, false }, { true, true }, { true, false } };
	static boolean[][] Q = { { true, false }, { false, true } };

	public static void main(String[] args) {

		System.out.println(W());

	}

	public static boolean p(int x, int y) {

		return P[x][y];

	}

	public static boolean q(int x, int y) {

		return Q[x][y];

	}

	public static boolean W() {

		for (int x = 0; x < 2; x++)

			if (f1(x, x))
				return true;

		return false;

	}

	public static boolean f1(int x, int y) {

		for (int j = 0; j < 2; j++)

			if (f2(x, y))
				return true;

		return false;

	}

	public static boolean f2(int x, int y) {

		if (!p(x, y))
			return false;

		return f3(x, y);

	}

	public static boolean f3(int x, int y) {

		return f4(x, y) || f5(x, y);

	}

	public static boolean f4(int x, int y) {

		if (f5(x, y))
			return f5(x, y);

		return false;

	}

	public static boolean f5(int x, int y) {

		for (int j = 0; j < 3; j++)

			if (q(x, y) && q(y, x))
				return true;

		return false;

	}

}
