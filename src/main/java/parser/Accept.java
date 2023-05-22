package parser;

public class Accept extends Action {
    public Accept(int number) {
        super(number);
    }

    @Override
    public String toString() {
        return "acc";
    }
}
