Single Number II

class Solution {
    public int singleNumber(int[] nums) {
        int ones=0,twos=0,three=0;
        for(int i=0;i<nums.length;i++){
          twos=twos | (nums[i] &ones);
            ones= ones^nums[i] ;
            three = ones&twos;
            ones= ones & (~three);
            twos= twos &(~three);
        }
        return ones;  
    }
}
