public class Mainnn {
    public static void main(String[] args){
        Child c= new Child();
        Child0 cc = new Child0();

        c.walk();
        cc.run();

        System.out.println("c gender "+ c.getGender());
        System.out.println("cc gender "+ cc.getGender());

        c.setGender("Male");
        cc.setGender("Female");

        System.out.println("c gender "+ c.getGender());
        System.out.println("cc gender "+ cc.getGender());

        c.name();
        cc.name();
    }
}