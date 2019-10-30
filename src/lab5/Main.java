package lab5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(3);
        myList.add(2);
        myList.add(5);
        System.out.println(myList);

        LogicalOp op = new LogicalOp();
        op.addToList(myList,5);

    }
}
