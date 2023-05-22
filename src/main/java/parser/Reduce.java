package parser;

public class Reduce extends Action {
    public Reduce(int number) {
        super(number);
    }

    @Override
    public String toString() {
        return "r" + this.number;
    }
}
