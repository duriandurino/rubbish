abstract class Motor{
    public void runMotor(){
        System.out.println("Brroom Brroom");
    }
}

class Yamaha extends Motor{
    String brand = "Yamaha";
}

public class Abstract{
    public static void main(String[]args){
         Yamaha y = new Yamaha();
         
         y.runMotor();
         System.out.println(y.brand);
    }
}