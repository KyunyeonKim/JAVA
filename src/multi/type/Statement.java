package multi.type;

public class Statement {
    public static void main(String[] args) {
        System.out.println("hello");
//        args = null;
        System.out.println(args.length);
        if(args == null){
            System.out.println("args == null");
        }

        Integer x =10;
        System.out.println(x.toString()+99);


        double avg = 79.99;
        if(avg <= 100 & avg >=90){
            System.out.println("A");
        } else if (avg>=80) {
            System.out.println("B");

        } else if (avg>=70) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }

    }
}
