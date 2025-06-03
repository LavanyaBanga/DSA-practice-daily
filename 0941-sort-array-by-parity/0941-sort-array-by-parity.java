class Solution {
    public int[] sortArrayByParity(int[] nums) {
       ArrayList<Integer>np=new ArrayList<>();
      
        for (int num : nums) {
            if (num % 2 == 0) {
                np.add(num);
               
            }
        }

     
        for (int num : nums) {
            if (num % 2 != 0) {
                np.add(num);
            }
        }

        int result[]=new int[np.size()];
        for(int i=0;i<np.size();i++){
            result[i]=np.get(i);
        }
        return result;
        
    }
}
