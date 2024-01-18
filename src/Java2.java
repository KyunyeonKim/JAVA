public class Java2 {
    public static void main(String [] args){
        String str1 = "아아 슬슬 오함마 준비해야 쓰것다";

        char ch1 = str1.charAt(0);
        char ch2 = str1.charAt(4);

        char ch3 = str1.charAt(str1.length() - 1);

        String str2 ="알리 알리 알라셩 알라리 알리";

        int int1 = str2.indexOf('알');
        int int2 = str2.indexOf("알",4);

        int int3 = str2.indexOf("알리");
        int int4 = str2.lastIndexOf("알리");
        int int5 = str2.lastIndexOf("알리",12);

        //포함되지 않는것은 -1호출
        int int6 = str2.indexOf('을');
    }
}
