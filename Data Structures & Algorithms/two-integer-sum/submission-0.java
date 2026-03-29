class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int len=nums.length;
        int diff,pos=0;
        int[] a =new int[2];
        for (int i=0;i<len;i++){
            diff=target-nums[i];
            if (map.containsKey(diff)){
                pos=map.get(diff);
                a[0]=pos;
                a[1]=i;
                }
                else{
                    map.put(nums[i],i);
                }
            }
    
    return a;
        
  
 }  
  }

