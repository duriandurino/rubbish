class Car{
    int wheels = 4;
    String brand = "Atoyot";
    
    public void runCar(){
        System.out.println("Vroom");
    }
}

public class OOP{
    public static void main(String[]args){
        Car c = new Car();
        
        System.out.print(c.brand);
        c.runCar();
    }
}

