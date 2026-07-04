class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> res = new ArrayList<>();
    
        int i = 0;
        int first;
        int last;
        StringBuilder s = new StringBuilder();

        while( i < nums.length){
            first = nums[i];
            int temp = first;

            while( ++i < nums.length && temp+1 == nums[i])
                temp += 1;
            
            last = temp;
            
            if( first == last )
                s.append(first);
            else{
                s.append(first);
                s.append("->");
                s.append(last);
            }
            res.add(s.toString());
            s.setLength(0);

        }

        return res;
    }
}
