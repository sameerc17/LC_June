Random Pick with Weight

class Solution {
    
    int c=0;
    TreeMap<Integer, Integer> map= new TreeMap<>();
    Random rand= new Random();
    
    public Solution(int[] w) {
        for (int i=0; i<w.length;i++){
            c+=w[i];
            map.put(c,i);
        }
    }
    
    public int pickIndex() {
        int key= map.higherKey(rand.nextInt(c));
        return map.get(key);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
