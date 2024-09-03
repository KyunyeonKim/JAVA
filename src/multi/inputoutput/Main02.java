package multi.inputoutput;

import multi.java20jdbc_oracle.test.test.com.member.MemberVO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");
        // mission
        // MemberVO 객체를 List에 넣어서 파일로 작성하고
        // 해당파일을 읽어들이는 프로그램을 작성해보세요.
        // 파일명 : listmembers.txt

        //Main09_mission : Output
        //Main09_mission2 : Input


        String fileName = "listmembers.txt";

        File file = new File(fileName);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);

            //리스트 컬렉션 생성
            List<MemberVO> list = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                MemberVO vo = new MemberVO(1+i,"admin"+(1+i),"hi1111"+(1+i),"kim"+(1+i),"010"+(1+i));
                list.add(vo);
            }
            oos.writeObject(list);

            oos.flush();
            System.out.println("end print.....");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }//end main
}
