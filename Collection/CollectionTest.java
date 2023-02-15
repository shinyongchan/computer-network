package Collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<Double> list = Arrays.asList(2.1, 3.14, 0.99);

        Iterator<Double> it = list.iterator(); //it를 이용하여 순회
        while(it.hasNext())
            System.out.print(it.next()+ " "); //next를 이용하여 값을 꺼냄
        System.out.println();


    }



}
