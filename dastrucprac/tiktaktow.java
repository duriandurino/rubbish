import java.util.Scanner;

public class tiktaktow{

    public static void main(String[]args){
        String[][] tikTable = {{"1","|","2","|","3",},
        {"-","+","-","+","-"},
        {"4","|","5","|","6"},
        {"-","+","-","+","-"},
        {"7","|","8","|","9"}};
        int pos;
        
        displayTable(tikTable);
        
    }
    
    public static void displayTable(String[][] tikTable){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(tikTable[i][j]);
            }
            System.out.println();
        }
    }
    
    
}