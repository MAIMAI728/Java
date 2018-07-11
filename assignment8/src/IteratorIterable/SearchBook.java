package IteratorIterable;
import java.util.Iterator;
import static java.lang.Character.SIZE;

/**
 * Created by mai on 2017/07/06.
 */

class SearchBook{
    public int Search(Book book){

            int counter = 0;

            for(Page p : book)
            {
                if(p.HasImage() && (p.getPageNumber()%2==0)){
                    counter ++;
                }
            }

            return counter;
    }




//    public boolean hasNext() {
//
//        // Check if the current element is the last in the array
//        return (nextIndex <= SIZE - 1);
//    }
//
//    public int next() {
//
//        // Record a value of an even index of the array
//        Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
//
//        // Get the next even element
//        nextIndex += 2;
//        return retValue;
//    }

}
