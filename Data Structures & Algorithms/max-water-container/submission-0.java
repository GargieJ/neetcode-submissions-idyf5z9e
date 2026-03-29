class Solution {
    public int maxArea(int[] heights) {
    int left=0;//1
    int right=heights.length-1;//7
    int max=0;//30
   while (left<right){
    int height=Math.min(heights[right],heights[left]);//6
    int area=height*(right-left);//6*6
    if (area>max){max=area;}//max=36
    if (heights[left]>heights[right]){right--;}//
    else if (heights[left]<heights[right]){left++;}
    else {left++;right--;}
   }
   return max; }
}
