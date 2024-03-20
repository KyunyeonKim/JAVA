package Java;

public class Java4 {
    public static void main (String[] args){

        String str1 = "%s의 둘레는 반지름 X %d x %f입니다.";
        String circle ="원";
        int two = 2;
        double PI = 3.14;

        //formatted: 주어진 형식에 따라 문자열 생성

        String str3 = String.format(str1, circle , two , PI);

    }
}
