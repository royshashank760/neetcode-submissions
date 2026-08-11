class Solution {
    public int[] productExceptSelf(int[] nums) {
         //make two array left and right to store the value of left product and right product..
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        
        //left product...
        left[0]=1;
        for(int i = 1; i<nums.length; i++ ){
            left[i] = left[i-1] * nums[i-1];

        }

        //right product...
        right[nums.length-1] = 1;
        for(int i = nums.length-2; i> -1; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        //new array to store the product of left and right array..
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = left[i] * right[i];
        }

        return ans;
    }
}  
