package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorMain {
    public static void main(String[] args) {
        List<Integer> numberList =new ArrayList<>();
        numberList.add(24);
        numberList.add(41);
        numberList.add(12);
        numberList.add(16);
        numberList.add(6);
        System.out.println("Without sorting :"+numberList);
        Collections.sort(numberList);
        System.out.println(numberList);
        MyComparator myComparator=new MyComparator();
        Collections.sort(numberList,myComparator);
        System.out.println(numberList);

    }
}
class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1<o2) return 1;
        else if (o1>o2) return -1;
        else return 0;
    }
}

