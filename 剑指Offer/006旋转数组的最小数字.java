import java.util.ArrayList;

public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array == null || array.length == 0)
            return 0;
        int len = array.length;
        return findmin(array,0,len-1);
    }
    
    private int findmin(int[] array, int left, int right) {
        if(left >= right || array[left] < array[right])
            return array[left];
        
        int mid = (left + right) / 2;
        if(array[mid] > array[left])
            return findmin(array,mid+1,right);
        else if(array[mid] == array[left])
            return findmin(array,mid+1,right)<findmin(array,left,mid-1)?findmin(array,mid+1,right):findmin(array,left,mid-1);
        else
            return findmin(array,left,mid);
    }
}
