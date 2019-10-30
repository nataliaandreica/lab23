package lab5;

import java.util.List;

public class LogicalOp {
    public void addToList(List<Integer> list, int number){
        list.add(1,number);
        list.forEach(System.out::println);
    }
}
