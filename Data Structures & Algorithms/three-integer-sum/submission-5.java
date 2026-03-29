class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> finalList=new ArrayList<>();
    List<Integer>tempList=new ArrayList<>();
    int left=1;
    int right=nums.length;int target=0;int sum=0;int prevLeft=0;int prevRight=0;
    Arrays.sort(nums);
    //-4,-1,-1,0,1,2
    for (int i=0;i<nums.length-2;i++){
        if (i>0 && nums[i]==nums[i-1]){continue;}
        left=i+1;
        right=nums.length-1;
        target=0-nums[i];
        while (left<right){
        sum=nums[left]+nums[right];
        if (sum==target){
            tempList.clear();
            tempList.add(nums[i]);
            tempList.add(nums[left]);
            prevLeft=nums[left];
            tempList.add(nums[right]);
            prevRight=nums[right];
            finalList.add(new ArrayList<>(tempList));
            left++;right--;
            while (left<right && prevLeft==nums[left]){left++;}
            while (right>left && prevRight==nums[right]){right--;}
            
        }
        else if (sum<target){
            left++;
        }
        else{
             right--;
        }
    }//while
        
    }//for 
  return finalList; }//func
}//end

