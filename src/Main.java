public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultAdd = calculator.addAToB(6,6);
        System.out.println(resultAdd);
        int resultSubtraction = calculator.subtractAFromB(7,5);
        System.out.println(resultSubtraction);
    }
}

class Calculator{

    public int addAToB(int a, int b) {
        return a + b;
    }

    public int subtractAFromB(int a, int b) {
        return a - b;
    }
}