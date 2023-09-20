import java.util.Scanner;

public class funcs{
    
    static int add(int a, int b, int sum){
    
        Scanner sc = new Scanner(System.in);
        int ssum = sum;
        
        System.out.println("enter a: ");
        a = sc.nextInt();
        System.out.println("enter a: ");
        b = sc.nextInt();
        
        sum = 5+b;
        
        return ssum;
    }    
    
    public static void main(String[]args){
    
        int a = 0;
        int b = 0;
        int sum=0;
        
        add(a, b, sum);
        System.out.println(sum);
        System.out.println(a);
        System.out.println(b);
    
    }

}