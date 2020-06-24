Unique Binary Search Trees

class Solution {
    
    public long binomialCoeff(int n, int k) { 
        long res = 1; 
        if (k > n - k) { 
            k = n - k; 
        } 
        for (int i = 0; i < k; ++i) { 
            res *= (n - i); 
            res /= (i + 1); 
        } 
        return res; 
    } 
    
    public int numTrees(int n) {
        long c = binomialCoeff(2 * n, n); 
        return (int)(c/(n+1));
    }
}
