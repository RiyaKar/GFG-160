//Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[].

//Note: It is guaranteed that the answer fits in a 32-bit integer.

class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        
        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];
        int maxSoFar = arr[0];
        
        for(int i = 1; i < n; i++) {
            int current = arr[i];
            
            if(current < 0){
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }
            maxEndingHere = Math.max(current, maxEndingHere * current);
            minEndingHere = Math.min(current, minEndingHere * current);
            
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
