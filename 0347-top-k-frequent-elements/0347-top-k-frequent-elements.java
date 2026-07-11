class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int element : nums){
            map.put(element, map.getOrDefault(element,0)+1);
        }

        ArrayList<Map.Entry<Integer,Integer>> arr =
                new ArrayList<>(map.entrySet());

        arr.sort((a,b) -> b.getValue() - a.getValue());

        int[] last = new int[k];

        for(int i = 0; i < k; i++){
            last[i] = arr.get(i).getKey();
        }

        return last;
    }
}
