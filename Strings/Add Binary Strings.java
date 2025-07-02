//iven two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
//Note: The input strings may contain leading zeros but the output string should not have any leading zeros.

// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        StringBuilder result = new StringBuilder();
        
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >=0 || carry != 0) {
            int bit1 = 0;
            int bit2 = 0;
            
            if (i >=0) {
                bit1 = s1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                bit2 = s2.charAt(j) - '0';
                j--;
            }
            int sum = bit1 + bit2 + carry;
            result.append(sum % 2);
            carry = sum / 2;
        }
        result.reverse();
        
        int index = 0;
        while (index < result.length() && result.charAt(index) == '0') {
            index++;
        }
        return (index == result.length()) ? "0" : result.substring(index);
    }
}
