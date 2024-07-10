package multi.java11;

import multi.test2.NoteBook;

public class Main04 {

    public static void main(String[] args) {

        //추상클래스의 객체 생성 - 상속관계의 다향성으로만 생성가능.
        //1.NoteBook를 상속받는 클래스 NoteBookEx
        //2.Annonymous inner

        NoteBook bookEx = new NoteBook() {
            @Override
            public int insert(int x, int y) {
                return 0;
            }

            @Override
            public String update(String name) {
                return "";
            }
        };
        int sum = bookEx.insert(11, 22);
        System.out.println("sum:" + sum);

        System.out.println(bookEx.update("kim"));


        //2.AnonyMous inner
        NoteBook book = new NoteBook() {
            @Override
            public int insert(int x, int y) {
                return x * y;
            }

            @Override
            public String update(String name) {
                return "hello " + name;
            }
        };
        System.out.println(book.insert(33, 44));
        System.out.println(book.update("lee"));
    }
}
