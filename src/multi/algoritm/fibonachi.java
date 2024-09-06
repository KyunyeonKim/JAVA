package multi.algoritm;

public class fibonachi {
    public static void main(String[] args) {
        int limit = 4000000;  // 4백만 이하로 제한
        int prev = 1;         // 첫 번째 피보나치 수
        int curr = 2;         // 두 번째 피보나치 수
        int sum = 0;          // 짝수 피보나치 수들의 합

        // 수열을 계산하면서 짝수 항만 더함
        while (curr <= limit) {
            if (curr % 2 == 0) {
                sum += curr;
            }

            // 피보나치 수 갱신
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        System.out.println("4백만 이하 짝수 피보나치 수들의 합: " + sum);
    }
    }

