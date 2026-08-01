class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ans = false;
        Map <Integer,Integer> map = new HashMap<>();

        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        } 

        for(int key : nums){
            if(map.get(key)>1)
            return true;
        }
        return ans;
    }
}