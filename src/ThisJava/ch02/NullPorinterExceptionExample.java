package ThisJava.ch02;

public class NullPorinterExceptionExample {
    public static void main(String[] args) {
        int[] intArray2={1,2,3,4,5};
        int [] intArray = null;
        intArray2[0] = 10;
        System.out.println("intArray2[0] = " + intArray2[0]);
//        intArray[0] = 10; //NullPointerException

        String str = null;
        String str2 = "안녕";
//        System.out.println("총 문자수:"+ str.length()); //NullPointerException
        System.out.println("총 문자수" + str2.length());
    }
}
