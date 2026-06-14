class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       // import java.util.*;
//public class SubsetGenerator {
    //public static List<List<Integer>> generateSubsets(int[] nums) {
        if (nums == null) {
            throw new NullPointerException("Input array cannot be null");
        }

        List<List<Integer>> result = new ArrayList<>();
        int arrayLength = nums.length;
        int totalSubsets = 1 << arrayLength;

        for (int subsetIndex = 0; subsetIndex < totalSubsets; subsetIndex++) {
            List<Integer> subset = new ArrayList<>();

            for (int elementIndex = 0; elementIndex < arrayLength; elementIndex++) {
                if ((subsetIndex & (1 << elementIndex)) != 0) {
                    subset.add(nums[elementIndex]);
                }
            }

            result.add(subset);
        }

        return result;
    }

   
}
        
