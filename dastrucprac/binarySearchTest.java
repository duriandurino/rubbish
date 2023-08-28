import java.util.*;

public class binarySearchTest{
    public static int binarySearch(int array[], int x, int arrSize){
        int low = 0;
        int arraySize = arrSize;
        
        while(low <= arraySize){
            int m = low + (arraySize - 1) / 2;
            
            if(array[m] == x){
                return m;
            }else if(array[m] < x){
                low = m + 1;
            }else{
                arraySize = m - 1;
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
