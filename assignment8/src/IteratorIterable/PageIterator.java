package IteratorIterable;

import java.util.Iterator;

/**
 * Created by mai on 2017/07/06.
 */

public class PageIterator implements Iterator<Page> {
    private Page[] pages;
    private int counter;

    PageIterator(Page[] pages){
        this.pages = pages;
        this.counter = 0;
    }

    @Override
    public boolean hasNext(){
        return this.pages.length>counter;
    }

    @Override
    public Page next(){
        if(hasNext()){
            Page page = this.pages[this.counter];
            this.counter++;
            return page;
        }
        return null;
    }
}
