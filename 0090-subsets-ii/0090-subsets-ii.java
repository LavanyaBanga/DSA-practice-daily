class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),result );
        return result;
    }

    public static void backtrack(int [] nums , int idx,List<Integer> curr,
    List<List<Integer>> result){

       result.add(new ArrayList<>(curr));


      

       for(int i = idx ; i < nums.length;i++){

        if(i > idx && nums[i] == nums[i-1]) continue;
       
        curr.add(nums[i]);
        backtrack(nums,i+1,curr,result);

        // exclude step
        curr.remove(curr.size() - 1);
     

       }
    }

}