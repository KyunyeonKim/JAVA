package Algoritm.chap02;

import java.util.Scanner;

class PhysicalExamination {

    static final int VMAX = 21; // 시력 분포를 0.0 ~ 2.0으로 나눔

    static class PhyscData {
        String name;
        int height;
        double vision;

        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        // 평균 키 계산
        static double aveHeight(PhyscData[] dat) {
            double sum = 0;

            for (int i = 0; i < dat.length; i++) {
                sum += dat[i].height;
            }
            return sum / dat.length;
        }

        // 시력 분포 계산
        static void distVision(PhyscData[] dat, int[] dist) {
            for (int i = 0; i < dist.length; i++) {
                dist[i] = 0; // 배열 초기화
            }

            for (int i = 0; i < dat.length; i++) {
                if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
                    dist[(int) (dat[i].vision * 10)]++;
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            PhyscData[] x = {
                    new PhyscData("강민하", 162, 0.3),
                    new PhyscData("김찬우", 173, 0.7),
                    new PhyscData("박준서", 175, 1.5),
                    new PhyscData("유서범", 171, 0.8),
                    new PhyscData("이수연", 168, 0.3),
                    new PhyscData("장경오", 174, 2.0),
                    new PhyscData("황지안", 169, 1.2),
            };

            int[] vdist = new int[VMAX]; // 시력 분포 배열

            System.out.println("신체 검사 리스트");
            System.out.println("이름    키   시력");
            System.out.println("--------------");

            for (int i = 0; i < x.length; i++) {
                System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
            }

            System.out.printf("\n평균 키: %.1fcm\n", PhyscData.aveHeight(x));

            distVision(x, vdist);

            System.out.println("\n시력 분포");
            for (int i = 0; i < VMAX; i++) {
                if (vdist[i] > 0) {
                    System.out.printf("%3.1f~: %2d명\n", i / 10.0, vdist[i]);
                }
            }
        }
    }
}
