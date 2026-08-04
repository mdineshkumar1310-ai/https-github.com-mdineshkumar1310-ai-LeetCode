class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] rev =new int[2*n];
        for(int i =0;i<n;i++){
            rev[i]=nums[i];
        }
        for(int i =0;i<n;i++){
            rev[n+i]=nums[n-1-i];
        }
        return rev;
    }
}