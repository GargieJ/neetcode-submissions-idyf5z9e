class Solution {
    public int lprod(int x,int[] a){//x is the index
        int left=x-1;
        int lprods=1;
        while (left>=0){
            lprods=lprods*a[left];
            left--;
        }
        return lprods;
    }
    public int rprod(int x,int[] b){
        int right=x+1;
        int rprods=1;
        while (right < b.length){
            rprods=rprods*b[right];
            right++;
        }
        return rprods;
    }
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            res[i]=lprod(i,nums)*rprod(i,nums);
        }
   return res; }
}
 
