class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        HashMap<Character,Character>map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        map.put('X','x');
        stack.push('X');
        for (int x=0;x<s.length();x++){
           
            if (map.containsKey(s.charAt(x))){
                stack.push(s.charAt(x));
            }
            else{
                if (!map.containsValue(s.charAt(x))){return false;}
                else{
                if (s.charAt(x) == map.get(stack.peek())){
                    stack.pop();
                }
                else{return false;}
            }
            }}
    if (stack.peek()=='X'){return true;}
    else{return false;}
    }
}
