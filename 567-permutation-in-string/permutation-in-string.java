import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        int low=0;
        for(int high =0;high<s2.length();high++){
            char lefth = s2.charAt(high);
            map2.put(lefth,map2.getOrDefault(lefth,0)+1);
            while(high-low+1>s1.length()){
                char leftl = s2.charAt(low);
                map2.put(leftl,map2.get(leftl)-1);
                if(map2.get(leftl)==0){
                    map2.remove(leftl);
                }
                low++;
            }
             if(map1.equals(map2)){
            return true;
        }

        }
       
        return false;
    }
}