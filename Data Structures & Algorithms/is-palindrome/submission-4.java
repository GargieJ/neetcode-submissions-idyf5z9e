class Solution {
    public String groomString(String s){
        String t="";
        for (int i=0;i<s.length();i++){
            if (Character.isLetterOrDigit(s.charAt(i))){
                t+=Character.toLowerCase(s.charAt(i));
            }
            
        }
   return t; }
    public boolean isPalindrome(String s) {
        String a=groomString(s);
        int left=0;
        int right=a.length()-1;
        for (int i=0;i<a.length();i++){
            if (a.charAt(left)==a.charAt(right)){left++;right--;}
            else{return false;}
            if (left==right){return true;}
           
        }
        return true;}
}
