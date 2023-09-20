import java.util.*;

public class Sudoku{
    public static void inputSudoku(int sudoku[][], int row, int col){
        Scanner sc = new Scanner(System.in);
        boolean loop = false;
        boolean esc = false;

            int tempSc = 0;
            esc = false;
            loop = false;
            for(int x = 0; x < row; x++){
                for(int y = 0; y < col; y++){
                    System.out.println("Input number to table: ");
                    tempSc = sc.nextInt();
                    if(tempSc <= 9 && tempSc >= 1){
                        sudoku[x][y] = tempSc;
                    }else{
                        y-=1;
                    }
                }
                System.out.println("\n");
            }
    }
    
    public static void outputSudoku(int sudoku[][], int row, int col){
        for(int x = 0; x < row; x++){
            System.out.print("|");
            for(int y = 0; y < col; y++){
                System.out.print(sudoku[x][y] + "|");
            }
            System.out.print("\n");
        }
    }
    
    public static boolean checkSudoku(int sudoku[][], int row, int col){
        boolean repeat = false;
        int[] checker = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        for(int x = 0; x < row; x++){
            for(int y = 0; y < col; y++){
                for(int i = 0; i < 9; i++){
                    if(sudoku[x][y] == i + 1){
                        checker[i] += 1;
                    }
                }
            }            
        }
        
        for(int i = 0; i < 9; i++){
            if(checker[i] == 1){
                repeat = true;
            }
        }
        
        for(int i = 0; i < 9; i++){
            if(checker[i] > 1){
                repeat = false;
                System.out.println((i+1) + " is not unique Salonga");
            }
        }

        return repeat;
    }
    
    public static void main(String[] args){
        int[][] sudoku = new int[3][3];
        int row = 3;
        int col = 3;

        inputSudoku(sudoku, row, col);
        outputSudoku(sudoku, row, col);
        if(checkSudoku(sudoku, row, col) == true){
            System.out.println("\nThere are no repeating values.");
        }else{
            System.out.println("\nThere are repeating values.");
        }
    }
}
