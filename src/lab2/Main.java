package lab2;

public class Main {

    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int result = sum(x, y);
        System.out.println(result);
        result = substract(x, y);
        System.out.println(result);
        result = multiply(x, y);
        System.out.println(result);
        float resultdiv = divide(x, y);
        System.out.println(resultdiv);

    }

    public static int sum(int first, int second) {
        int rez = first + second;
        return rez;
    }

    public static int substract(int first, int second) {
        int rez = first - second;
        return rez;
    }

    public static int multiply(int first, int second) {
        int rez = first * second;
        return rez;
    }

    public static float divide(float first, float second) {
        return first / second;

    }
}

