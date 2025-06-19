//Day 1 - Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

//Note: The second largest element should not be equal to the largest element.


class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if (arr == null || arr.length < 2){
            return -1;
        }
        
        int largest = arr[0];
        int secondLargest = -1;
        
        for ( int i = 1; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != largest) {
                if (secondLargest == -1 || arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }
        }
        return secondLargest;
    }
}
