import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int temp = Integer.MAX_VALUE;
        int[][] numbers = new int[3][3];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Input num here: ");
                numbers[i][j] = sc.nextInt();
            }
            System.out.print("\n");
        }
        
        System.out.print("Table: \n");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("|");
                System.out.print(numbers[i][j] + "|");
            }
            System.out.print("\n");
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(numbers[i][j] < temp){
                    temp = numbers[i][j];
                }
            }
            System.out.print("\n");
        }
        int smallestNum = temp;
        System.out.print("\nSmallest Value on Table: " + smallestNum);
    }
}

