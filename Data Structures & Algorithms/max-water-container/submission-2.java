class Solution {
    public int maxArea(int[] heights) {
    int left=0;
    int right=heights.length-1;
    int max=0;
   while (left<right){
    int area=Math.min(heights[right],heights[left])*(right-left);
    if (area>max){max=area;}
    if (heights[left]>heights[right]){right--;while (left<right && right<heights.length-1 && heights[right]<heights[right+1]){right--;}}
    else if (heights[left]<heights[right]){left++;while (left<right && left>0 && heights[left]<heights[left-1]){left++;}}
    else {left++;right--;}
   }
   return max; }
}
