package lesson11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CollectionUtils collectionUtilsImpl = new CollectionUtilsImpl();
        List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(12);

        Set<Integer>set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(8);

        //  System.out.println(collectionUtilsImpl.union(list,set));
        //  System.out.println(collectionUtilsImpl.unionWithoutDuplicate(list,set));
          System.out.println(collectionUtilsImpl.intersection(list,set));
        //  System.out.println(collectionUtilsImpl.intersectionWithoutDuplicate(list,set));
        //  System.out.println(collectionUtilsImpl.difference(list,set));


    }
}
