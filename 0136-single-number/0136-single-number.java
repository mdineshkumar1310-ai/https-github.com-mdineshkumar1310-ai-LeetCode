class Solution {
    public int singleNumber(int[] nums) {
        int repeated = 0;
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            repeated^=n;
        }
        return repeated;
    }
}