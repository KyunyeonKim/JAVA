package multi.test;

import multi.test2.NoteBook;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");

        NoteBook nb = new NoteBook();

        System.out.println(nb);
        System.out.println(nb.model);
        System.out.println(nb.price);
        System.out.println(nb.size);

        nb= new NoteBook("Apple" , 200 , 5.5);

        System.out.println(nb);
        System.out.println(nb.model);
        System.out.println(nb.price);
        System.out.println(nb.size);


    }
}
