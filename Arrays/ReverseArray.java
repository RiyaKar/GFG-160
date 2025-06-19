//You are given an array of integers arr[]. Your task is to reverse the given array.

//Note: Modify the array in place.

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        
        for ( int i=0 ; i< n/2 ; i++) {
            int j = n-1-i;
            
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
        }
    }
}
