package multi.testt;

import java.util.Random;

public class Main05Random {

    public static String getRandomString(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length); // 배열의 길이 내에서 무작위 인덱스 생성
        return array[randomIndex];
    }

    public static String arrayToString(String[] array) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) { // 마지막 요소가 아닐 때만 공백 추가
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static int randomham(){
        Random random = new Random();
        int num1= random.nextInt(7);
        int num2= random.nextInt(7);
        int num3= random.nextInt(7);

        int sum = num1+num2+num3;

        return sum;
    }

    public static int[] lotto(){
       Random rd = new Random();
       int[] lotto = new int[6];
       for(int i = 0; i< lotto.length; i++){
           lotto[i]= rd.nextInt(45)+1;
       }

        return lotto;
    }



    public static void main(String[] args) {
        String[] languages = {"java", "css", "javascript", "html", "jsp", "spring", "web"};

        // 배열을 함수에 전달하여 리턴된 문자열을 출력
        String result = arrayToString(languages);
        System.out.println(result);

        String randomString = getRandomString(languages);
        System.out.println("Randomly selected string: " + randomString);
        //java css javascript html jsp spring web을 문자배열에 넣으세요
        //아래함수로 배열을 전달해서 리턴된 문자열을 출력하세요

        int randomham = randomham();
        System.out.println(randomham);

        System.out.println("lottonumber:");
        int [] lottonumbers = lotto();
        for (int i = 0; i < lotto().length ; i++) {
            System.out.print(lottonumbers[i]+" ");
        }
    }
}
