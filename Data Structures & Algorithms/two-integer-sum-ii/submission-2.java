class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] a=new int[2];
        int left=0;
        int right=numbers.length-1;
        int sum=0;
        int a0=0;int a1=0;
        while (left<right){
            sum=numbers[left]+numbers[right];
            if (sum<target){left++;}
            else if (sum>target){right--;}
            else{a0=left;a1=right;break;}
        }
        a[0]=a0+1;a[1]=a1+1;
    return a;}
}
