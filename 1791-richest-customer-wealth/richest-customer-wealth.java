class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int cs = 0;

        for(int i = 0;i<accounts.length;i++){
            for(int j = 0 ; j<accounts[0].length;j++){
                cs = cs + accounts[i][j];
            }
            max = Math.max(cs,max);
            cs = 0;
        }
        return max;
    }
}