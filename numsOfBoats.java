import java.util.Arrays;
class Solution {
    public int numsOfBoats(int[] people, int limit) {

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int count_boats = 0;

        while (left <= right) {

            if (people[left] + people[right] <= limit) {
                left++;
                
            }

            right--;
             count_boats++;
        }

        return count_boats;
        
    }
}