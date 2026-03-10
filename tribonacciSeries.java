public class tribonacciSeries {

    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if ( n == 1) {
            return 1;
        }

        if ( n == 2) {
            return 1;
        }

       int firstTerm = 0;
       int secondTerm = 1;
       int thirdTerm = 1;

       for (int index = 1; index <= n; index++){
        int fourthTerm = firstTerm + secondTerm + thirdTerm;
        firstTerm = secondTerm;
        secondTerm = thirdTerm;
        thirdTerm = fourthTerm;
       }
       return firstTerm;
    }

    

    public static void main(String[] args) {
        // int n = 3;
        int n = 4;

        System.out.println(tribonacci(n));

    }
}
