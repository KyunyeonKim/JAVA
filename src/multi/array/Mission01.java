package multi.array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mission01 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] member = new String[3][4];

        for (int x = 0; x < 3; x++) {


            System.out.println("id");
            String id = br.readLine();
            System.out.println("password");
            String password = br.readLine();
            System.out.println("name");
            String name = br.readLine();
            System.out.println("tel");
            String tel = br.readLine();


            member[x][0] = id;
            member[x][1] = password;
            member[x][2] = name;
            member[x][3] = tel;


            // 배열에 값 저장
            for (int i = 0; i < member.length; i++) {
                for (int j = 0; j < member[i].length; j++) {
                    System.out.printf("%s",member[i][j]);
                }
                System.out.println();
            }

        }


    }
    }










