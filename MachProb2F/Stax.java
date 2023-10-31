import java.util.Stack;

public class Stax{

    public static void main(String[] args){
    
        Stack<Integer> stax = new Stack<>();
        Stack<Integer> rStax = new Stack<>();
        
        stax.push(100);
        stax.push(200);
        stax.push(300);
        
        System.out.println(stax);
        
        while(!stax.isEmpty()){
        
            int tmp = stax.pop();
            rStax.push(tmp);
        
        }
        
        System.out.println(rStax);
        
    }

}