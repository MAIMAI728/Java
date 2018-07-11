package IteratorIterable;

import java.util.*;
/**
 * Created by mai on 2017/07/07.
 */
public class GenericSearch<T extends Iterable<T1>,T1> {

    //[T1] = Pages
    //[T] is object, [checker] is condition
    public int Search(T t, Checker checker){
        int numPage = 0;

        //T1 is the All the pages of the book
        for(T1 t1 : t){
            if(checker.Check(t1)){
                numPage ++;
            }
        }
        return numPage;
    }
}
