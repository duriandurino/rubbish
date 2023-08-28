import java.util.*;
import java.io.*;

public class GastoTracker{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try{
            FileWriter fw = new FileWriter("bank.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            FileReader fr = new FileReader("bank.txt");
            BufferedReader br = new BufferedReader(fr);        
            String getMoneyTxt = br.readLine();
            System.out.println(getMoneyTxt);
            if(getMoneyTxt.equals(null) || getMoneyTxt.equals("")|| getMoneyTxt.equals("null")){
                bw.write("0");
                bw.close();
            }
            int getMoney = Integer.parseInt(getMoneyTxt);
            System.out.println(getMoney);
            System.out.println("Butngan kwarta bank? (P"+ getMoney + ") y/n");
            char edit = sc.next().charAt(0);
            if(edit=='y'){
                                
                System.out.println("Input Kwarta: ");
                int money = sc.nextInt();
                getMoney += money;
                getMoneyTxt = String.valueOf(getMoney);
                clearTxt();
                bw.write(getMoneyTxt);
                bw.close();
                
            }
            System.out.println("Money in bank: P"+ getMoneyTxt);
            br.close();
            boolean loop = true;
            boolean append = false;
            do{
                //System.out.println("hahah");
                if(!sc.hasNextInt()){
                    getMoneyTxt = String.valueOf(getMoney);
                    System.out.println("Money after this session: P"+getMoneyTxt);
                    loop = false;
                }else{
                    int deduct = sc.nextInt();
                    
                    System.out.println("- P"+ deduct);
                    //System.out.println("haha");
                    getMoney -= deduct;
                    System.out.println("New Kwarta: P"+getMoney);
                    
                    append = true;
                    loop = true;
                }
            }while(loop);
            if(append == true){
                System.out.print("New bank value saved..."+getMoneyTxt);
                clearTxt();
                bw.write(getMoneyTxt);
                bw.close();
                System.out.println(br.readLine());
            }
            bw.close();
            fr.close();
            System.out.println(br.readLine());
            br.close();
            
        }catch(IOException e){
            
        }
    }
    
    public static void clearTxt(){
        try{
            PrintWriter pw = new PrintWriter("bank.txt");
            pw.close();
        }catch(IOException e){
        }
    }
}