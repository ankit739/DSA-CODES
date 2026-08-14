class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int low = 0;
        int maxLen = 0;

        for (int high = 0; high < s.length(); high++) {
            int index = s.charAt(high) - 'a';
            freq[index]++;

            while (freq[index] > 2) {
                freq[s.charAt(low) - 'a']--;
                low++;
            }

            maxLen = Math.max(maxLen, high - low + 1);
        }

        return maxLen;
    }
}