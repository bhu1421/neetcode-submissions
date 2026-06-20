class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for(String word : strs){

            char [] arr = word.toCharArray();
            Arrays.sort(arr);
            String word_sort = new String(arr);

            if(map.containsKey(word_sort)){
               map.get(word_sort).add(word); 
            }
            else{
                map.put(word_sort, new ArrayList<>());
                map.get(word_sort).add(word); 

            }
        }
        return new ArrayList<>(map.values());
    }
}
