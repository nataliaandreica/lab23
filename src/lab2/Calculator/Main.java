package lab2.Calculator;

import com.sun.org.apache.xpath.internal.SourceTree;

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
        System.out.println("Rezultatul adunarii este: " + sum(2, 3));
        System.out.println("Rezultatul scaderii este: " + substract(2.5f, 3));
        System.out.println("Rezultatul inmultirii este: " + multiply(2,3));
        System.out.println("Rezultatul impartirii este: " + divide(2.5f,3));
        System.out.println("Media este: " + average(2,5,9));
        System.out.println("Catul este: " +divide1(5,3));
        System.out.println("Temperatura este: " + temperatura(80));
        System.out.println("897 inch sunt "+ metri(897)+" m");
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

    public static int multiply(int first, int second) {
        int multiply = first * second;
        return multiply;
    }

    public static float divide(float first, float second) {
        float divide = first / second;
        return divide;
    }
    public static float average (float first, float second, int third){
        float average = (first + second+ third)/3;
        return average;
    }
    public static int divide1(int first, int second) {
        int divide1 = first % second;
        return divide1;}

        public static float temperatura (float first){
        float temperatura  = 5f/9f*(first-30);
        return temperatura;
        }
        public static float metri (float first){
            float metri = first/39.37f;
            return metri;
        }
}






