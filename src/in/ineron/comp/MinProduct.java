package in.ineron.comp;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class MinProduct{
    public int minProductSum(int[] nums1, int[] nums2) 
    {
        int ans = 0;
        // Sort nums1 and nums2 in ascending order.
        Arrays.sort(nums1);
        // Initialize a PriorityQueue pq as a Max-Heap, and add 
        // every element of nums2 to pq.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums2){
            pq.add(i);
        }
        int i = 0;
   
        while(i < nums1.length && !pq.isEmpty()){
            // Add the product of nums[idx] and the maximum element
            // left in pq, remove this element from pq.
            ans += nums1[i] * pq.poll();
            i++;
        }
        return ans;
    }
}