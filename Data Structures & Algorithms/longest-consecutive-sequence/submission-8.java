class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        else{
        int prev,next=0;
        int count,max=1;
        HashSet<Integer>set=new HashSet<>();
        for (int n:nums){

            set.add(n);
        }//duplicates removed
        set.add(1001);
        PriorityQueue <Integer> pq=new PriorityQueue<>((a,b)->a-b);//min pq
        Iterator<Integer> iterator=set.iterator();
        while (iterator.hasNext()){
            pq.offer(iterator.next());
        }//values in pq
        int total=pq.size();
        prev=pq.poll();
        count=1;
        next=pq.poll();
        int flag=2;
        
        
        while (flag<=total){
            if (next==prev+1){
                count+=1;
                
            }
            else{
                if (count>max){
                    max=count;
                }
                count=1;
                
            }
            if (count>max){
                    max=count;
                }
            prev=next;
            if(pq.size()>1){next=pq.poll();}
            
            flag++;
            
            
        }
        
    return max;}}
}
