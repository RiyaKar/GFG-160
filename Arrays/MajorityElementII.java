//You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 

//Note: The answer should be returned in an increasing format.

class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n = nums.length;
        
        List<Integer> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for (int i=0;i<n;) {
            int count =1;
            int current = nums[i];
            
            while (i + count < n && nums[i+count] == current) {
                count++;
            }
            if (count > n/3) {
                result.add(current);
            }
            i+=count;
        }
        return result;
    }
}
