class Solution {
    public List<Integer> getRow(int rowIndex) {
        
      
        int[]row =new int[rowIndex+1];
        row[0]=1;
        for(int i=1;i<=rowIndex;i++){
            for(int j=i;j>=1;j--){
                  row[j]=row[j-1]+row[j]; 
            }
        }
       List<Integer> result = new ArrayList<>();
        for (int val : row) {
            result.add(val);
        }
        return result;
    }
}