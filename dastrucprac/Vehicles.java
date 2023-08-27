public class Vehicles{
    
    public void start(){
        Cars c = new Cars();
        Motorcycles m = new Motorcycles();
        Bicycles b = new Bicycles();
        
        System.out.println("\nStarting vehicles...");
        c.run();
        m.run();
        b.run();
    }
    
    public class Cars extends Vehicles{
        public void run(){
            System.out.println("Car is running.");
        }
    }
    
    public class Motorcycles extends Vehicles{
        public void run(){
            System.out.println("Motorcycle is running.");
        }
    }
    
    public class Bicycles extends Vehicles{
        public void run(){
            System.out.println("Bicycle is running.");
        }
    }
}