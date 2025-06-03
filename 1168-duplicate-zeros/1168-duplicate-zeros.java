

class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){

            list.add(arr[i]);
            if(arr[i]==0){
                list.add(0);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }

      
     
    }
}
