class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int index = 0;
        int n = chars.length;

        while (i < n) {
            int count = 0;
            char current = chars[i];

          
            while (i < n && chars[i] == current) {
                count++;
                i++;
            }

         
            chars[index++] = current;

        
            if (count > 1) {
                String current_count = String.valueOf(count);
                for (char ch : current_count.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }
}
