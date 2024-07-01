package multi.type;

import java.io.IOException;

public class Mission4_for3 {
    public static void main(String[] args) throws IOException {
        for(int i = 1; i <10; i++){
            for (int f= 1; f<10; f++){
                System.out.printf("%s  *   %s  =",i,f);
                System.out.println(i*f);
            }
        }




    }//end main
}//end class