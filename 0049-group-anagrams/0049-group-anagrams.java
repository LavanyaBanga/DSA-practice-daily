class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String strsort = sort(str);

            if (map.containsKey(strsort)) {
                List<String> li = map.get(strsort);
                li.add(str);
                map.put(strsort, li);
            } else {
                List<String> li = new ArrayList<>();
                li.add(str);
                map.put(strsort, li);
            }
        }

        List<List<String>> ans = new ArrayList<>();
        for (List<String> li : map.values()) {
            ans.add(li);
        }

        return ans;
    }

    public String sort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}