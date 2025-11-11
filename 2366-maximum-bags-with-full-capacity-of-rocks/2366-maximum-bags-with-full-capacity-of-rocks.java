class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;

        // Calculate remaining capacities
        for(int i = 0; i < n; i++) {
            capacity[i] -= rocks[i];
        }

        // Sort remaining capacities
        Arrays.sort(capacity);

        // Determine maximum number of bags that could have full capacity
        int maxBags = 0;

        for(int i = 0; i < n; i++) {
            if(additionalRocks >= capacity[i]) {
                additionalRocks -= capacity[i];
                maxBags++;
            } else {
                break;
            }
        }
        
        return maxBags;

    }
}