class Solution {
    public boolean containsDuplicate(int[] nums) {
       boolean ans = false;

       HashMap <Integer,Integer> map = new HashMap<>();

       for(int x : nums){
        map.put(x,map.getOrDefault(x,0)+1);
       }

       for(int x : nums){
        if(map.get(x)>1){
            ans = true;
            return ans;
        }
       }

       return ans;
    }
}