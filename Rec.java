    public class Rec {
        public static String recursion(int n) {
        if (n < 10) {
                return Integer.toString(n);}
                else {
               return n % 10 + " " + recursion(n / 10);}
            }

        public static void main(String[] args) {
            System.out.print(recursion(1884365343));
        }
}

