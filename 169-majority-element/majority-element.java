class Solution {
    public int majorityElement(int[] nums) {
        
        Map <Integer,Integer> map = new HashMap<>();
        int majority = -1;
        int n = nums.length/2;

        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int key : nums){
            if(map.get(key)>n){
                majority = key;
            }
        }
        return majority;
    }
}