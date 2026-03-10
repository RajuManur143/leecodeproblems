public class productofarray {
    public static void main(String[] args) {

        int[] nums = {3, 6, 0, 1};

        int Fmax = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > Fmax) {
                Smax = Fmax;
                Fmax = nums[i];
            } 
            else if (nums[i] > Smax) {
                Smax = nums[i];
            }
        }

        System.out.println("First Max: " + Fmax);
        System.out.println("Second Max: " + Smax);
        System.out.println("Product: " + (Fmax * Smax));
    }
}
