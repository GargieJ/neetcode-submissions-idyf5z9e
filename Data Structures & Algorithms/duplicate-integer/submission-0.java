class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int len=nums.length;
        for (int i=0;i<len;i++){
            if (map.containsKey(nums[i])){
                return true;
            }
            else{
            map.put(nums[i],i);            
       
    }
}return false;}}