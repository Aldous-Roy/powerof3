public class pow3 {
    public static boolean isPowerOfThree(int n) {
        if(n==1){
            return true; 
        }
        else if(n%3!=0 || n==0){
            return false;
        }
        else{
            return isPowerOfThree(n/3);
        }
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));  // True, 
        System.out.println(isPowerOfThree(9));   // True, 
        System.out.println(isPowerOfThree(0));  // False,
    }
}
