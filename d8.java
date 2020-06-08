Power of Two

class Solution {
    public boolean isPowerOfTwo(int x) {
        if(x<=0 || (x & (x-1))>0)
            return false;
        return true;
    }
}
