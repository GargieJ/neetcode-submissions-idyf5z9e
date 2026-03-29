class Solution {

    
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[] arr=new int[k];
        for (int n:nums){
            map.put(n,(map.getOrDefault(n,0)+1));
        }
        //frequency map created
        PriorityQueue <Integer> pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for (int i:map.keySet()){
            pq.offer(i);
            if (pq.size()>k){
                pq.poll();
            }
        }
        //min priority queue 
        for (int i=0;i<k;i++){
            arr[i]=pq.poll();
        }
        //building
         
return arr;
          
          
        }
        



        

        
}
        



    

