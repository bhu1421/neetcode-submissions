class Solution {
    public boolean isAnagram(String s, String t) {
            char [] sarr = s.toCharArray();
            Arrays.sort(sarr);
            char [] tarr = t.toCharArray();
            Arrays.sort(tarr);

            if(Arrays.equals(sarr, tarr)){
                return true;
            }
            else{
                return false;
            }
    }
}
