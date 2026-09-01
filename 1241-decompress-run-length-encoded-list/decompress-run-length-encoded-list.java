class Solution {
    public int[] decompressRLElist(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        while(j<=n){
            int freq = nums[i];
            int val = nums[j];
            while(freq>0){
                list.add(val);
                freq--;
            }
            i+=2;
            j+=2;
        }
        int [] arr = new int[list.size()];
        int k = 0;
        for(int x : list){
            arr[k] = x;
            k++; 
        }
        return arr;
    }
}