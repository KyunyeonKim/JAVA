package multi.algoritm;

import java.util.Scanner;

public class Main_str3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println(solution(x,y,z));
    }

    public static int solution(int x,int y, int z){{
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        int answer = 0;
        answer = x+y+z;
        return answer;
    }
    }
}
