public class isPalindrome {

    public static boolean IsPalindrome(int x) {

        if (x < 0) {
            System.out.println("you have to enter positive number only");
            return false;
        }

        int n = x;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        if (reversed == x){
            System.out.println("yes this is palindrome");
            return true;
        }
        else {
            System.out.println("sorry this not palindrome try again");
            return false;
        }
    }

    public static void main(String[] args) {
        int x = -121;
        System.out.println(IsPalindrome(x)); // prints true/false
    }
}
