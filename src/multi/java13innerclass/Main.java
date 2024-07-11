package multi.java13innerclass;

public class Main {
    public static void main(String[] args) {
        // 변수 할당
        Mother mother1 = new Mother() {
            @Override
            public void play() {
                System.out.println("Playing in anonymous inner class assigned to a variable.");
            }
        };
        mother1.play();

        test(mother1);
        test(new Mother() {
            @Override
            public void play() {
                System.out.println("mother2");
            }
        });
    }

    public static void test(Mother mother) {
        mother.play();
    }

    public static Mother getMother() {
        return new Mother() {
            @Override
            public void play() {
                System.out.println("Playing in anonymous inner class returned from a method.");
            }
        };
    }
}
