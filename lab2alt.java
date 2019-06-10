public class lab2alt {

   static boolean [][] P = { {true,  true},  {true,  false}, {true, true} };
   static boolean [][] Q = { {false, false}, {false, false} };
   static boolean [][] R = { {true,  false}, {false, true}, {false, true} };

   public static void main (String[] args) {
      System.out.println(W());
   }

   public static boolean p(int x, int y) {
      return P[x][y];
   }

   public static boolean q(int x, int y) {
      return Q[x][y];
   }

   public static boolean r(int x, int y) {
      return R[x][y];
   }

   public static boolean W() {
      for (int x = 0; x < 3; x++)
          if (!f1(x)) return false;
      return true;
   }

   public static boolean f1(int x) {
      for (int y = 0; y < 2; y++)
          if (f2(x,y)) return true;
      return false;
   }

   public static boolean f2(int x, int y) {
      if (p(x,y)) return f3(x,y);
      return true;
   }

   public static boolean f3(int x, int y) {
      return f4(y) || f5(x);
   }

   public static boolean f4(int y) {
      for (int x = 0; x < 2; x++)
          if (q(x,y)) return true;
      return false;
   }

   public static boolean f5(int x) {
      for (int y = 0; y < 2; y++)
          if (!r(x,y)) return false;
      return true;
   }
}