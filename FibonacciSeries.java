class FibonacciSeries {
    public static int Fibonacci(int n){

        // Check if  you enter zero return 0
        if (n == 0){
            return 0;
        }

        // Check if you enter one return 1
        if (n == 1){
            return 1;
        }

        // firstTerm and secondTerm should start from 0 and 1
        int firstTerm = 0;
        int secondTerm = 1;

        for (int index = 1; index <= n; index++){
            int thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        return firstTerm;
    }




// Main function
public static void main(String[] args){

    int n = 5;
    System.out.println(Fibonacci(n));

}
}
