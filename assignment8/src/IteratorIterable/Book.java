package IteratorIterable;

import java.util.Iterator;

/**
 * Created by mai on 2017/07/06.
 */
public class Book implements Iterable<Page> {


    //３つのBookに必要なもの
    private String title;
    private enum BookCategory {
        Science,
        History,
        Food,
        It,
        Engineering,
        Novel;
    }
    private BookCategory bookCategory;
    private Page[] pages;


    //constructor
    //デフォルトコンストラクター(引数がない)
    private Book(){};
    //通常のコンストラクター(デフォルトを禁止しているのでpage[]のみ許されている状態)
    //これがもうsetterであるが、インスタンス化された時だけしか呼ばれないもの
    public Book(Page[] pages) {
        this.pages = pages;
    }


    //getterとsetter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public BookCategory getBookCategory(){
        return bookCategory;
    }
    public void setBookCategory(BookCategory bookCategory){
        this.bookCategory = bookCategory;
    }


    @Override
    public Iterator<Page> iterator() {
        return new PageIterator(pages);
    }


}
