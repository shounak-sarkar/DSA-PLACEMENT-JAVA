import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0, maxLen = 0;
        while (r < s.length()) {
            char currentChar = s.charAt(r);
            if (map.containsKey(currentChar)) {

                // Move the left pointer to the right of the previous occurrence of currentChar
                l = Math.max(map.get(currentChar) + 1, l);

            }

            // Update the map with the current character's index
            map.put(currentChar, r);
            // Calculate the current window size
            int currLen = r - l + 1;
            // Update maxLen if current window is larger
            maxLen = Math.max(currLen, maxLen);
            r++;
        }
        return maxLen;
    }
}
