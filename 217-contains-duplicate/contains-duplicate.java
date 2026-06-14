import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
             if(nums[i] == nums[i+1]){
            //{
                //System.out.println("true");
            //}
            return true;
           // else
           // {
                //System.out.println("false");
          //  }
           // return false;
        }}
       // return nums [nums.length];
       return false;

    } 
}

