class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

      HashMap<Character , Integer> map = new HashMap<>();
      for( int i = 0 ; i < s.length() ; i++){
        if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0) + 1);
        }else{
            map.put(s.charAt(i), 1);
        }
      }
      for( int k = 0 ; k < t.length() ; k++){
        if(!map.containsKey(t.charAt(k))){
            return false;
        }
        int val = map.get(t.charAt(k));
        if(val == 0){
            return false;
        }
        else{
            map.put(t.charAt(k), val-1);
        }
      }
      return true;
    }
}
