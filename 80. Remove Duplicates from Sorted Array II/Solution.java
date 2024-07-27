class Solution {
    public int removeDuplicates(int[] nums) {
        int unique=0;
        int n=nums.length;
        int duplicate=2;
        while(duplicate<n){
            if(nums[duplicate]!=nums[unique]){
                nums[unique+2]=nums[duplicate];
                unique++;
                duplicate++;

            }
            else{
                duplicate++;
            }
        }
        return unique+2;
    }
}