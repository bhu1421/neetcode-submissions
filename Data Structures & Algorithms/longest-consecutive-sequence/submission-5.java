class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();

        for (int num : nums) {
            hash.add(num);
        }

        int longest_seq = 0;

        for (int num : hash) {
            if (!hash.contains(num - 1)) {
                int length = 1;

                while (hash.contains(num + length)) {
                    length++;
                }

                longest_seq = Math.max(length, longest_seq);
            }
        }
        return longest_seq;
    }
}
