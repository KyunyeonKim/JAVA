package Java;

public class test1 {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);


        int score = 85;
        String result = (!(score>90))? "가":"나";
        System.out.println(result);

        int pencils = 534;
        int students = 30;
        int pencilsPerStudent=(pencils/students);
        System.out.println(pencilsPerStudent);

        int pencilsLeft = (pencils%students);
        System.out.println(pencilsLeft);
    }
    }
