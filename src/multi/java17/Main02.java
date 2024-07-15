package multi.java17;

public class Main02 {
    public static void main(String[] args) {

        try {
            int[][] suss = new int[5][5];
            System.out.println(new int[5][5]);



        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("catch array index...");
        }catch (NullPointerException ex){
            System.out.println("catch nullpointer");
        }catch (NumberFormatException ex){
            System.out.println("catch nullpointer");
        }
        System.out.println("end main");
    }
}
