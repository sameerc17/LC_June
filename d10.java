Search Insert Position

class Solution {
    public int searchInsert(int[] nums, int target) {
        int ind=Arrays.binarySearch(nums,target);
        return (ind>=0)?ind:-(ind+1);
    }
}
