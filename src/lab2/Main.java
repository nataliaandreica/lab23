package lab2;

public class Main {
        public static void main(String[] args) {
      /*  int x = 3;
        int y = 5;
        int result = sum(x, y);
        System.out.println(result);
        result = substract(x, y);
        System.out.println(result);
        result = multiply(x, y);
        System.out.println(result);
        float resultdiv = divide(x, y);
        System.out.println(resultdiv);*/

        printMyName();
        System.out.println("Rezultatul adunarii este:" + sum(2, 3));
        System.out.println("Rezultatul scaderii este:" + substract(2.5f, 3));
    }

 /*   public static int sum(int first, int second) {
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

    }*/

    public static void printMyName() {

        System.out.println("Hello \n Natalia");

    }

    public static int sum(int first, int second) {
        int sum = (first + second);
        return sum;
    }

    public static float substract(float first, float second) {
        float substract = first - second;
        return substract;
    }

}





