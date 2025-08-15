class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        // arraylist to store final result
        findSubsets(0, nums, new ArrayList<>(), ans);
        // 0 ---> jis index s start hoga 
        // nums-- jis array s values le rhe h
        // current subset 
        // arraylist to store result
        return ans;
    }

    static void findSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> ans) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(current)); 
            return;
        }
        current.add(nums[index]);
        findSubsets(index + 1, nums, current, ans);

        current.remove(current.size() - 1);
        findSubsets(index + 1, nums, current, ans);
    }
}

// class Main {
//     public static void main(String[] args) {
//         subseq("","abc");
       
//     }
//     static void subseq(String p,String up){
//         if(up.isEmpty()){
//             System.out.println(p);
//             return;
            
//         }
//         char ch=up.charAt(0);
//         subseq(p+ch,up.substring(1));
//          subseq(p,up.substring(1));
//     }
// }