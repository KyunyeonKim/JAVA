package Java;

public class Java {
    public static void main(String[] args){

        String str1="";
        String str2="\t\n";

        // isEmpty : 문자열의 길이가 0인지 여부
        int int1 = str1.length();
        int int2 = str2.length();

        //isBlank:공백(white space)을 제외한 문자열 길이가 0인지 여부
        boolean bool1 = str1.isEmpty();
        boolean bool2 = str2.isEmpty();

        boolean bool3 = str1.isBlank();
        boolean bool4 = str2.isBlank();


        String str3 = "\t 에 네 르 기 파! \n";

        //trim: 앞뒤의 공백을 제거한다.
        String str4 = str3.trim();


        str3 = str3.trim();


    }
}
