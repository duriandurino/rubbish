public class patterns{

    public static void main(){
    
        for(int i = 0; i<5;i++){
            
            for(int j = 0;j<i;j++){
            
                System.out.print("  ");
            
            }
                                        //inverted pyramid
            for(int k = 0; k<((5-i)*2)-1;k++){
            
                System.out.print("* ");
            
            }
            
            System.out.println();
        
        }
                                                    //FORMS AN HOURGLASS
        for(int i = 0; i<5;i++){
            
            for(int j = 0;j<5-i-1;j++){
            
                System.out.print("  ");
            
            }
                                        //upright pyramid
            for(int k = 0; k<((i+1)*2)-1;k++){
            
                System.out.print("* ");
            
            }
            
            System.out.println();
        
        }
        
        System.out.println();
        
        for(int i = 0; i<5;i++){
            
            for(int j = 0;j<5-i-1;j++){
            
                System.out.print("  ");
            
            }
            
            for(int k = 0; k<((i+1)*2)-1;k++){
            
                System.out.print("* ");
            
            }
            
            System.out.println();
        
        }
        
        for(int i = 0; i<4;i++){
            
            for(int j = 0;j<i+1;j++){
            
                System.out.print("  ");
            
            }
            
            for(int k = 0; k<((4-i)*2)-1;k++){
            
                System.out.print("* ");
            
            }
            
            System.out.println();
        
        }
        
    }

}