class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> prefix = new HashMap<>();
        prefix.put(0,1);

        int sum = 0;
        int cnt = 0;

        for(int num : nums){
            sum+= num;
            cnt += prefix.getOrDefault(sum-k,0);
            prefix.merge(sum,1, Integer::sum);
        }
        return cnt;
    }
}