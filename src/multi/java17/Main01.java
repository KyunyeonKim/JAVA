package multi.java17;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");
    }


    private static void test02(){
        System.out.println(10/0);
        try {
            System.out.println("try...1");
            System.out.println("try...2");

        }catch (ArithmeticException ex){
            System.out.println("catch...3");

        }
    }

    private static void test03(){
        try {
            System.out.println("try...1");
            System.out.println("try...2");

        }catch (NullPointerException ex){
            System.out.println("catch...3");

        }
    }

    private static void test04(){
        try {
            System.out.println("try...1");
            String str = "구구";
            System.out.println(Integer.parseInt(str)+100);
            System.out.println("try...2");

        }catch (NullPointerException ex){
            System.out.println("catch...3");

        }
    }


    private static void test01(){
        int [] sus = new int[5];
        System.out.println(sus[5]);
        try {
            System.out.println(sus[5]);
        }catch (ArrayIndexOutOfBoundsException ex){

        }
    }
}
