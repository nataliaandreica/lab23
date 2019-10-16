package lab4.Calculator;

public class LogicalOp {
    public int verifyGreaterNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }



    public void printFromHundred(int number, int x) {
        for (int i=number ; i >= x; i --){
            System.out.println(i);
        }

    }

}