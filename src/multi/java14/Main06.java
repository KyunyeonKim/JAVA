package multi.java14;

import java.util.*;

public class Main06 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random rd = new Random();

        while (set.size()<6){
            int su = rd.nextInt(45)+1;
            System.out.println(su);
            set.add(su);
        }
        System.out.println(set);

        Object[] arr = set.toArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Generated Lotto Numbers: " + set);
    }
}
