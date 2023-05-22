package parser;

public class Shift extends Action {
    public Shift(int number) {
        super(number);
    }

    @Override
    public String toString() {
        return "s" + this.number;
    }
}
