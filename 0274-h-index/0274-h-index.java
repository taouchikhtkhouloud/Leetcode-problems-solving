class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
    int b = citations.length;
    Arrays.sort(citations);
        for(int i =0 ; i<n ; i++){
           if(b>citations[i]){
               b--;
           }
           else{
               return b;
           }
            
        }
     return b;
    }
}