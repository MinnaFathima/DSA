class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();  // We create a map to store numbers we’ve seen so far.                       Key = number from array, Value = index of that number
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            else{
                map.put(nums[i],i); //If we didn’t find a pair yet, we store the current number and its index in the map so we can check it later
            }
        }
        
        return new int[] {};        //If no answer found, return an empty array
    }
}