class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num , map.getOrDefault(num , 0) +1);
            }else{
                map.put(num , 1);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        list.sort(  (x,y)   ->   ( map.get(y) - map.get(x) )  );
        
        int [] arr = new int[k];
        for(int i = 0 ; i < k ; i++){
            arr[i] = list.get(i);
        }
     return arr ;
    }
}
