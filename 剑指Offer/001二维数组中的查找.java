public class Solution {
    public boolean Find(int target, int[][] array) {
        
        for(int i = 0; i < array.length; i++){
            int start = 0;
            int end = array[0].length - 1;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(target == array[i][mid])
                    return true;
                if(target > array[i][mid])
                   start = mid + 1;
                else
                   end = mid - 1;
            }
        }
        return false;
    }
                   
}
                   

