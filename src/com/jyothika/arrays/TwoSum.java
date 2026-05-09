class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int len = arr.length;
        int i=0, j=len-1;
        Arrays.sort(arr);
        while(i < j) {
            int sum = arr[i] + arr[j];
            if(sum == target) return true;
            // move left pointer to the right
            else if(sum < target) i++;
            // move right pointer to the left
            else j--;
        }
        return false;
    }
}