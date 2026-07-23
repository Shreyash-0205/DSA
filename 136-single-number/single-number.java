class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap <>();
        int result = -1;

        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int key : map.keySet()){
            if(map.get(key)==1){
                result = key;
            }
        }
        return result;
    }
}