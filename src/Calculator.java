public class Calculator {
    static void calc(double namA, double namB, char operation) {
        double result = 0;

        switch (operation) {
            case '+':
                result = namA + namB;
                break;
            case '-':
                result = namA - namB;
                break;
            case '*':
                result = namA * namB;
                break;
            case '/':
                result = namA / namB;
                break;
            default:
                System.out.println("Ups, incorrect operation type");
        }
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        calc(20, 10, '+');
        calc(20, 10, '-');
        calc(20, 10, '*');
        calc(20, 10, '/');
        calc(20, 10, '$');
    }
}

