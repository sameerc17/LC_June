Sort Colors

class Solution {
    public void sortColors(int[] nums) {
        int r=0,w=0,b=0;
        for(int x:nums){
            if(x==0)
                r++;
            else
                if(x==1)
                    w++;
            else
                b++;
        }
        for(int i=0;i<r;i++)
            nums[i]=0;
        for(int i=r;i<r+w;i++)
            nums[i]=1;
        for(int i=r+w;i<nums.length;i++)
            nums[i]=2;
    }
}
