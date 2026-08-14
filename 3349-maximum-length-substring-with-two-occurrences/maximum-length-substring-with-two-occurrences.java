class Solution {
    public int maximumLengthSubstring(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       int low = 0;
       int maxlen = -1;
        for(int high = 0;high<s.length();high++){
            char ch = s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                char leftChar = s.charAt(low);
                map.put(leftChar,map.get(leftChar)-1);
                low++;
            }
            maxlen = Math.max(maxlen,high-low+1);
        }
        return maxlen;

    }
}