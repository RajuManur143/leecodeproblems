class Main {
    public boolean increasingTriplet(int[] nums) {

        int Fmax = Integer.MAX_VALUE;
        int Smax = Integer.MAX_VALUE;
        int Tmax = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];

            if (Fmax >= element) {
                Fmax = element;
            }
            else if (Smax >= element) {
                Smax = element;
            }
            else {
                Tmax = element;
                return true;
            }
        }

    return false;    

    }


    public static void main(String[] args) {

        Main sol = new Main();

        // Test input
        int[] nums = {5,4,0,1,4,5};

        boolean yes = sol.increasingTriplet(nums);

        System.out.println("Median = " + yes);
    }
}