
public class Lab2Model1 {
	
	static boolean [] P = {true, true};
	static boolean [] Q = {false, true};

	public static void main(String[] args) {
		
		System.out.println(W());

	}
	
	public static boolean p(int x) {
		
		return P[x];
		
	}
	
	public static boolean q (int x) {
		
		return Q[x];
	}
	
	public static boolean W() {
		
		for (int x = 0; x <= 3; x++)
			if(!f1(x)) return false; 
		
		return true; 
		
	}
	
	public static boolean f1(int x) {
		
		for (int y = 0; y <2; y++)
			if (f2(x)) return true;
					return f2(x);
		
	}
	
	public static boolean f2(int x) {
		
		if (f3(x)) return f3(x);
		
		return false;
		
	}
	
	public static boolean f3(int x) {
		
		if (!f4(x)) return false;
		
		return true;
	}
	
	public static boolean f4(int x) {
		
		for (x = 0; x <= 2; x++) 
		
		if (p(x) && q(x)) return true;
		
		return false;
	}

}
