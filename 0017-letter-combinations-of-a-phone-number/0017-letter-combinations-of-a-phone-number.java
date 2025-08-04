class Solution {
    public void function(List<String> ans, int index,int n, String digits, List<String> list, StringBuilder s)
    {
        if(index>=n)
        {
            ans.add(s.toString());
            return;
        }

        int number=digits.charAt(index)-'0';

        String value=list.get(number);

        for(int i=0; i<value.length();i++)
        {
            s.append(value.charAt(i));
            function(ans,index+1,n,digits,list,s);

            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {

        List<String> ans=new ArrayList<>();
        int n=digits.length();
        if(n==0) return ans;

        List<String> list=new ArrayList<>();
        list.add("zero");
        list.add("one");
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        list.add("mno");
        list.add("pqrs");
        list.add("tuv");
        list.add("wxyz");

        StringBuilder s=new StringBuilder();

        function(ans,0,n,digits,list,s);
        return ans;
    }
}