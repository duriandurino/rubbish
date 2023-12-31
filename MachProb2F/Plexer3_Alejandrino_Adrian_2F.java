import java.util.*;

public class Plexer3_Alejandrino_Adrian_2F{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int size = 0;
        
        while(true){
    
          System.out.println("Input array size: ");
          
          if(sc.hasNextInt()){
            size = sc.nextInt();
            break;
          }
          
          System.out.println("Pls input again…");
          sc.nextLine();
          
        }
        
        int[] arr = new int[size];
        int[] dup = new int[size];
        
         for(int i=0; i<size;i++){
              System.out.println("Input to array: ");
              
              if(sc.hasNextInt()){
                arr[i]= sc.nextInt();
              }else{
                System.out.println("Pls input again…");
                i-=1;
                sc.nextLine();
              }
          
        }
        
        System.out.println("Array before sorting:");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        int count = 0;
        
        for(int i = 0; i<size;i++){
            
            for(int j = i+1; j<size;j++){
                //System.out.println(arr[i]+"-"+arr[j]);
                if(arr[i] == arr[j] && i!=j && dup[count+1]!=arr[i]){
                    
                    dup[count] = arr[i];
                    count+=1;
                    //System.out.println(dup[i]);
                }
            }
            
        }
        
        for(int i = 0; i<size; i++){
            for(int j = 1; j <size-i;j++){
                if(arr[j-1]>arr[j]){
                    int tmp = arr[j-1];
                    
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        System.out.println("Array after sorting:");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("\nDuplicated values:");
        for(int i = 0; i<count; i++){
            System.out.print(dup[i]+" ");
        }
    
    }

}