//Given an integer array arr[]. You need to find the maximum sum of a subarray.

class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int totalMax = arr[0];
        int h = arr[0];
        
        for(int i =1;i < arr.length;i++) {
            h = Math.max(arr[i], h + arr[i]);
            
            totalMax = Math.max(totalMax, h);
        }
        return totalMax;
    }
}
