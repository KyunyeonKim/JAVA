package multi.array;



public class Main04 {

    public static void main(String[] args) {

       int [] [] suss = new int[][] {new int[]{11,22,33},new int[]{55,66,77,88}};


        for (int i = 0; i < suss[0].length; i++) {
            System.out.print(suss[0][i]+" ");
        }
        System.out.println();
        System.out.println("================================");



        for (int x = 0; x < suss.length; x++) {
            for (int i = 0; i < suss[x].length; i++) {
                System.out.print(suss[x][i]+" ");
            }
            System.out.println();
        }
        System.out.println();

        int [][] arrs = new int [2][];
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }


        arrs[0] = new int[]{1,1,1,1,1};
        arrs[1] = new int[]{2,2,2,2,2,2,2};


        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }


        for (int x = 0; x < arrs.length; x++) {
            for (int i = 0; i < arrs[x].length; i++) {
                System.out.println(arrs[x][i]+ " ");
            }
            System.out.println();
        }


        int [][] arrs2 = new int[2][4];
        for (int i = 0; i < arrs2.length; i++) {
            System.out.println(arrs2[i]);

        }

        for (int x = 0; x < arrs2.length; x++) {
            for (int i = 0; i < arrs2[x].length; i++) {
                System.out.print(arrs2[x][i]+ " ");
            }
            System.out.println();
        }

        //정적배열과 동적배열 각각 생성
        //1.문자열 2.차원배열을 만들고 출력해보세요

        char[][] arrs3 = new char[2][4];

        arrs3[1] = new char[]{'E', 'F', 'G', 'H'};
        arrs3[0] = new char[]{'E', 'F', 'G', 'H'};

        for (int x = 0; x < arrs3.length ; x++) {
            for (int i = 0; i <arrs3[x].length ; i++) {
                System.out.print(arrs3[x][i]+" ");
            }
            System.out.println();
        }


        //2.실수 2.차원배열을 만들고 출력해보세요

        float[][] arrs4 = new float[2][4];
        for (int x = 0; x < arrs4.length ; x++) {
            for (int i = 0; i <arrs4[x].length ; i++) {
                System.out.print(arrs4[x][i]+" ");
            }
            System.out.println();
        }


        System.out.println("==============");



        String[][] arrs5= new String[2][4];

        // 첫 번째 행에 문자열 할당
        arrs5[0] = new String[]{"E", "F", "G", "H"};

        // 두 번째 행에 문자열 할당
        arrs5[1] = new String[]{"E", "F", "G", "H"};

        // 배열 출력
        for (int x = 0; x < arrs5.length; x++) {
            for (int i = 0; i < arrs5[x].length; i++) {
                System.out.print(arrs5[x][i] + " ");
            }
            System.out.println();
        }


        for(String[] ars5:arrs5){
            for (String x : ars5){
                System.out.println(x+ " ");
            }
            System.out.println();
        }




    }


    }










