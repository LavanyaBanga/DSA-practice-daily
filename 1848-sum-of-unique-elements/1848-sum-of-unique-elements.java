class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int b:nums){
            a.put(b,a.getOrDefault(b,0)+1);
        }
        int sum=0;
        for(int c:a.keySet()){
            if(a.get(c)==1){
                sum+=c;
            }
        }
        return sum;
        
    }
}