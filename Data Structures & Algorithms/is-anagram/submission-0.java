class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character,Integer>map=new HashMap<>();
    int lenS=s.length();
    int lenT=t.length();
    int count,val=1;
    
    if (lenS!=lenT){
        return false;
    }
    else{
        for (int i=0;i<lenS;i++){
            if (map.containsKey(s.charAt(i))){
                count=map.get(s.charAt(i));
                count++;
            }
            else{
                count=1;
            }
            map.put(s.charAt(i),count);
            }
        for (int j=0;j<lenT;j++){
            if (map.containsKey(t.charAt(j))){
                val=map.get(t.charAt(j));
                if (val==1){
                    map.remove(t.charAt(j));
                }
                else{
                    map.put(t.charAt(j),val-1);

                }
            
            }
            
        }
        if (map.isEmpty()){
                return true;
            }
    }
return false;}
}
