class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int zeroCount = 0;
        int prod = 1;
        for (int i =0; i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
                continue;
            }

            prod = prod*nums[i];
        }
        if(zeroCount>1){
            Arrays.fill(nums, 0);
            return nums;
        }

        for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
             if(zeroCount==1){
                res[i] = 0;
             }
             else{
                res[i]=prod/nums[i];
                }
           }
           else{
                res[i] = prod;
           }
            
        }
        return res;
    }
}  
