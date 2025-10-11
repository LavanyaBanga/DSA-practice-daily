class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> unique = new HashMap<>();
        
        for(int a : arr){
            unique.put(a, unique.getOrDefault(a, 0) + 1);
        }
        HashSet<Integer> count = new HashSet<>();
        for(int b : unique.values()){
            if(count.contains(b)) return false; 
            count.add(b);
        }

        return true; 
    }
}
