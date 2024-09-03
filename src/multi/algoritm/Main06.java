package multi.algoritm;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main06 {
    public static void main(String[] args) throws IOException {

        //텍스트 파일을 읽어오는 스트림
        String path = "C:\\Users\\kgn47\\IdeaProjects\\JAVA\\src\\multi\\algoritm\\text.txt";
        // 해당파일을 한줄한줄 읽어서 스트림에 반영해준다
        System.out.println(Files.lines(Paths.get(path), Charset.forName("UTF-8")).toList());


    }
}
