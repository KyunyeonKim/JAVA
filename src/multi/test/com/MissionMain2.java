package multi.test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissionMain2 {
    public static void main(String[] args) throws IOException {



    String[][] member1 = new String[5][5];
    Member mb = new Member();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int x = 0; x < 5; x++) {

            System.out.println("멤버 번호");
            mb.number = Integer.parseInt(br.readLine());
            System.out.println("아이디");
            mb.id = br.readLine();
            System.out.println("비번");
            mb.password = br.readLine();
            System.out.println("이름");
            mb.name = br.readLine();
            System.out.println("전화번호");
            mb.phnumber = br.readLine();


            member1[x][0]=String.valueOf(mb.number);
            member1[x][1]=String.valueOf(mb.id);
            member1[x][2]=String.valueOf(mb.password);
            member1[x][3]=String.valueOf(mb.name);
            member1[x][4]=String.valueOf(mb.phnumber);


            for (int i = 0; i <member1.length ; i++) {
                System.out.printf("멤버번호: %s, 아이디: %s, 비번: %s, 이름: %s, 전화번호: %s%n",
                        member1[i][0],member1[i][1],member1[i][2],
                        member1[i][3],member1[i][4]);



            }






        }
}
}
