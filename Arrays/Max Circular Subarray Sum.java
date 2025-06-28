//You are given a circular array arr[] of integers, find the maximum possible sum of a subarray. In a circular array, the subarray can start at the end and wrap around to the beginning. Return the maximum subarray sum considering both non-wrapping and wrapping cases.

class Solution {
    public int circularSubarraySum(int arr[]) {
        // Code here
        int n = arr.length;
        
        int currMax = arr[0], maxSum = arr[0];
        int totalSum = arr[0];
        for(int i=1; i < n;i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSum = Math.max(maxSum, currMax);
            totalSum+=arr[i];
        }
        int currMin = -arr[0], minSum = -arr[0];
        for(int i=1; i < n ;i++) {
            arr[i] = -arr[i];
            currMin = Math.max(arr[i], currMin + arr[i]);
            minSum = Math.max(minSum, currMin);
        }
        int circularSum = totalSum + minSum;
        
        if(circularSum == 0)
          return maxSum;
          
        return Math.max(maxSum, circularSum);
    }
}
