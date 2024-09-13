package Algoritm.chap01;

import java.util.Scanner;

public class PhysicalExamination {
    static final int VMAX = 21;

    static class PhyscData{
        String name;
        int height;
        double vision;

        PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static  double aveHeight(PhyscData[] pd){
        double sum = 0;

        for (int i = 0; i < pd.length; i++)
            sum+= pd[i].height;

        return sum/pd.length;
    }

    static void distVision(PhyscData[] dat , int[]dist){
        int i = 0;
        dist[i] = 0;
        for (i = 0; i < dat.length ; i++)
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                dist[(int) (dat[i].vision * 10)]++;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("강민하",162,0.3),
                new PhyscData("김찬우",162,0.3),
                new PhyscData("박준서",162,0.3),
                new PhyscData("유서범",162,0.3),
                new PhyscData("이수연",162,0.3),
                new PhyscData("정경오",162,0.3),

        };

        int[] vdist = new int[VMAX];

        System.out.println("신체검사 리스트");


    }

}
