class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n:nums){
            set.add(n);
        }

        int maxSeq = 0;
        for(int n:nums){
            int seq=1;
            if(set.contains(++n)){
                seq++;
                while(set.contains(++n)){
                    seq++;
                }
            }
            maxSeq=Math.max(maxSeq,seq);   
        }
        return maxSeq;
    }
}
