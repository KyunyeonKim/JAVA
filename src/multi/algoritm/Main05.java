package multi.algoritm;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Main05 {

    public static void main(String[] args) {
        String str = "aaa:bbb:ccc";
        List<String> data = Arrays.asList(str.split(":"));
        System.out.println(data);
        System.out.println(Pattern.compile(":").splitAsStream(str).toList());

    }
}
