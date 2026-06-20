class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for(String word : strs){
//sorted the word from the list one by one
            char [] arr = word.toCharArray();
            Arrays.sort(arr);
            String word_sort = new String(arr);
//it map contain the word just append new word into list
            if(map.containsKey(word_sort)){
               map.get(word_sort).add(word); 
            }

/* if not , create the new list with the sorted word and append 
the anagram word to the list created */
            else{
                map.put(word_sort, new ArrayList<>());
                map.get(word_sort).add(word); 

            }
        }
        return new ArrayList<>(map.values());
    }
}
