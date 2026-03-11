import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones to the heap
        for (int ele : stones) {
            pq.add(ele);
        }

        while (pq.size() > 1) {
            int first = pq.remove();   // largest
            int second = pq.remove();  // second largest

            int newStone = first - second;

            if (newStone != 0) {
                pq.add(newStone);
            }
        }

        return pq.size() == 0 ? 0 : pq.remove();
    }
}