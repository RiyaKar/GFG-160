//Given a string s consisting of lowercase English Letters. Return the first non-repeating character in s.
//If there is no non-repeating character, return '$'.
//Note: When you return '$' driver code will output -1.

class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        int[] freq = new int[26];
        
        for (int i = 0;i < s.length();i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0;i < s.length();i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return '$';
    }
}
