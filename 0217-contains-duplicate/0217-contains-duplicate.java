class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> yo = new HashSet<>();
        for(int i = 0; i < nums.length; i ++){
            if(yo.contains(nums[i])){
                return true;
            }
            else{
                yo.add(nums[i]);
            }
        }
        return false;
    }
}