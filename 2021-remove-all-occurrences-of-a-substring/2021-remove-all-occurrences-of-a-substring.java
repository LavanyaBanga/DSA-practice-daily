class Solution {
    public String removeOccurrences(String s, String part) {
      
        if (!s.contains(part)) {
            return s;
        }
       
        s = s.replaceFirst(part, "");
     
        return removeOccurrences(s, part);
    }
}
