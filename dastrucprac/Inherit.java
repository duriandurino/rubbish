public class Inherit{
    public static void main(){
        Honda h = new Honda();
        Toyota t = new Toyota();
        Nissan n = new Nissan();
        
        System.out.print(h.brand);
        h.runCar();
        System.out.print(" at a speed of "+h.topSpeed);
        System.out.println();
        
        System.out.print(t.brand);
        t.runCar();
        System.out.print(" at a speed of "+t.topSpeed);
        System.out.println();
        
        System.out.print(n.brand);
        n.runCar();
        System.out.print(" at a speed of "+n.topSpeed);
        
    }
}