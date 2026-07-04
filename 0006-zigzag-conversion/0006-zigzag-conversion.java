class Solution {
    public String convert(String s, int r) {

       if(r==1 || s.length()<r)
       return s;
    
    StringBuilder[] arr = new StringBuilder[r];
        for (int i = 0; i < r; i++) {
        arr[i] = new StringBuilder(); 
         }

    
    int ind=0;
    int st=1;
    for(char ch:s.toCharArray()){
        arr[ind].append(ch);
        if(ind==0)
        st=1;
        else if(ind == r-1)
        st=-1;

        ind+=st;
    }
     StringBuilder sb=new StringBuilder();
    for(int i=0;i<r;i++){
            sb.append(arr[i]);
    }

    return sb.toString();

    }
}