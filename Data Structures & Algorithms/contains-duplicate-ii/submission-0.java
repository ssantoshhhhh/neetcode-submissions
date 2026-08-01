class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int currNum = nums[i];
            if(map.containsKey(currNum)){
                int lastPos = map.get(currNum);
                int distance = i-lastPos;

                if(distance<=k){
                    return true;
                }
            }
            map.put(currNum,i);
        }
        return false;
    }
}