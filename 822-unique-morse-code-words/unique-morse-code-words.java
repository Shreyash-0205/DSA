class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet <String> set = new HashSet<>();

        for(String word: words){
            String transformation = "";
            for(char ch : word.toCharArray()){
                transformation += morse[ch-'a'];
            }
            set.add(transformation);
        }
        return set.size();
    }
}