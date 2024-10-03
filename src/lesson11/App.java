package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add("very very long word" + i);
        }

        long time2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add("very very long word" + i);
        }

        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }

        long time4 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }

        long time5 = System.currentTimeMillis();

        System.out.println("ArrayList add ---" + (time2 - time1) + " ms");
        System.out.println("LinkedList add ---" + (time3 - time2) + " ms");
        System.out.println("ArrayList get ---" + (time4 - time3) + " ms");
        System.out.println("LinkedList get ---" + (time5 - time4) + " ms");
    }
}
