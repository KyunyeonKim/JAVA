package multi.test;

public class Main06 {
    public static void main(String[] args) {
        SmartPhone sp  = new SmartPhone();
        System.out.println(sp.name);
        System.out.println(sp.price);
        System.out.println(sp.weight);
        System.out.println(sp.version);


        sp= new SmartPhone("길동",2,3,4);

        System.out.println(sp.name);
        System.out.println(sp.price);
        System.out.println(sp.weight);
        System.out.println(sp.version);
    }
}
