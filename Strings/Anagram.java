//Given two strings s1 and s2 consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, "act" and "tac" are an anagram of each other. Strings s1 and s2 can only contain lowercase alphabets.

//Note: You can assume both the strings s1 & s2 are non-empty.

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] freq = new int[26];
        
        for (int i = 0;i < s1.length();i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
