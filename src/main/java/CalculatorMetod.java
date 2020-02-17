public class  CalculatorMetod {
    private int a;
    private int b;

    public CalculatorMetod(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int subs() {
        return a - b;
    }

    public int multi() {
        return a * b;
    }

    public int div() {
        return a  / b;
    }

}
