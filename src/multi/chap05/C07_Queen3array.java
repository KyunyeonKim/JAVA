package multi.chap05;
// 8퀸 문제 풀이
//3개의 배열(flag_a, flag_b, flag_c)을 사용하는 한정 조작을 수행하면 
//8퀸 문제의 조건을 만족하여 퀸을 효율적으로 배치할 수 있다.
//프로그램을 실행하면 92개의 조합이 출력된다. 
class C07_Queen3array {
    static boolean[] flag_a = new boolean[8];     // 각 행에 퀸이 이미 배치되었는가?
    static boolean[] flag_b = new boolean[15];    // 대각선 ↙에 퀸이 이미 배치되었는가?
    static boolean[] flag_c = new boolean[15];    // 대각선 ↘에 퀸이 이미 배치되었는가?
    static int[] pos = new int[8];    // 각 열의 퀸의 위치
    static int count=0;
    //--- 각 열의 퀸의 위치를 출력 ---//
    static void print() {
        for (int i = 0; i < 8; i++)
            System.out.printf("%2d", pos[i]);
        System.out.println("========"+ ++count);
    }

    //--- i열의 알맞은 위치에 퀸을 배치 ---//
    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            if (flag_a[j] == false &&                    // 가로(j행)에 아직 배치하지 않음
                    flag_b[i + j] == false &&            // 대각선 ↙에 아직 배치하지 않음
                    flag_c[i - j + 7] == false) {        // 대각선 ↘에 아직 배치하지 않음
                pos[i] = j;                              // 퀸을 j행에 배치함
                if (i == 7)                              // 모든 열에 배치함
                    print();
                else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                    set(i + 1);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}