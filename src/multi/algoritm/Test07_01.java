package multi.algoritm;

public class Test07_01 {
    public static void main(String[] args) {
        int count = 0;   // 소수 개수 카운트
        int number = 1;  // 현재 숫자

        while (count < 10001) {
            number++;  // 숫자를 증가
            if (isPrime(number)) {  // 현재 숫자가 소수인지 확인
                count++;  // 소수일 경우 카운트 증가
            }
        }

        System.out.println("10001번째 소수는: " + number);
    }

    // 소수 판별 함수
    public static boolean isPrime(int num) {
        if (num < 2) return false;  // 2보다 작은 수는 소수가 아님
        for (int i = 2; i <= num / 2; i++) {  // num의 절반까지 나누어 봄
            if (num % i == 0) return false;  // 나누어 떨어지면 소수가 아님
        }
        return true;  // 소수임
    }
}
