public class twoSumSortedArray {

     public static void main(String[] args) {
        int[] numbers = {1,7,8,10,19};
        int target = 9;
        int [] ans = new int[2];

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {

                ans[0] = start + 1;
                ans[1] = end + 1;
                break;
                
            }

            else if (sum < target) {
                start ++;
            }
            else {
                end --;
            }
        }

        System.out.println("index of sorted array is ="+ans);
     }
}