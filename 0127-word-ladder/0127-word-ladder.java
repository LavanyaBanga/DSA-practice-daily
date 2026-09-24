class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> list) {
        Queue<String> q=new LinkedList<>();
        HashSet<String> set=new HashSet<>(list);
        if(!set.contains(endWord)){
            return 0;
        }
        q.add(beginWord);
        int count=1;
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i< s;i++){
                String word=q.poll();
                char[] arr=word.toCharArray();
                for(int j=0;j<arr.length;j++){
                    char old=arr[j];
                    for(char k='a';k<='z';k++){
                        arr[j]=k;
                        String w=new String(arr);
                        if(w.equals(endWord)){
                            return count+1;
                        }
                        else{

                         if(set.contains(w)){
                            q.add(w);
                            set.remove(w);
                         }
                        }
                    }
                    arr[j]=old;
                }
            }
            count++;
        }
        return 0;
    }
}