package multi.LIFOFIFO;

public class Coin {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "value=" + value +
                '}';
    }

    public Coin(int value) {
        this.value = value;
    }
}
