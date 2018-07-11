package IteratorIterable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mai on 2017/07/07.
 */

public class GenericSearchList<T extends Iterable<T1>,T1> {
    public List<T1> Search(T t,Checker checker){
        List<T1> list = new ArrayList<T1>();
        for(T1 t1 : t){
            if(checker.Check(t1)){
                list.add(t1);
            }
        }
        return list;
    }

}
