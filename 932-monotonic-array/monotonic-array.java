class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 0; i < nums.length - 1; i++) {
            
            // If current > next, not increasing
            if(nums[i] > nums[i+1]) {
                increasing = false;
            }

            // If current < next, not decreasing
            if(nums[i] < nums[i+1]) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }
}