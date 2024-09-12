public class pow3 {
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));  // True, 
        System.out.println(isPowerOfThree(9));   // True, 
        System.out.println(isPowerOfThree(10));  // False,
    }
}
