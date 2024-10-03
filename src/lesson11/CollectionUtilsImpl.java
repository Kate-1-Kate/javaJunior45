package lesson11;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
       if (a == null || b == null){
           throw new NullPointerException();
       }
        List<Integer> result = new ArrayList<>();
       result.addAll(a);
       result.addAll(b);

        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null){
            throw new NullPointerException();
        }
        List<Integer> result = new ArrayList<Integer>(a);
        result.retainAll(b);
        result.addAll(b);
        result.retainAll(a);


        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null){
            throw new NullPointerException();
        }
        Set<Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);

        return result;


    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if ( a == null || b == null){
            throw new NullPointerException();
        }
        Set<Integer> result = new HashSet<>(a);
        result.retainAll(b);



        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null){
            throw new NullPointerException();
        }
        List<Integer> result = new ArrayList<Integer>(a);
        result.removeAll(b);
        b.removeAll(a);
        result.addAll(b);




        return result;
    }
}
