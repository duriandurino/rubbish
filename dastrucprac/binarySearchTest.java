import java.util.*;

public class binarySearchTest{
    public static int binarySearch(int array[], int x, int arrSize){
        int l = 0;
        int r = arrSize;
        
        while(l <= r){
            int m = l + (r - 1) / 2;
            
            if(array[m] == x){
                return m;
            }else if(array[m] < x){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int x = 23;
        int arrSize = array.length - 1;
        int result = binarySearch(array, x, arrSize);
        
        if(result == -1){
            System.out.print("Not present in array");
        }else{
            System.out.print("Result: " + result);
        }
    }
}
