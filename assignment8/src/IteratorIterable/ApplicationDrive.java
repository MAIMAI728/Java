package IteratorIterable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by mai on 2017/07/06.
 */

public class ApplicationDrive {
    public static void main(String[]args){

        Page p1 = new Page(4, true); //even + image
        Page p2 = new Page(1, true); //not even + image ... "This is it!"
        Page p3 = new Page(6, true); // even + image
        Page p4 = new Page(10, false); // even + no image
        Page p5 = new Page(2, false); // even + no image

        Page [] pages = new Page [] {p1, p2, p3, p4, p5};

        Book book = new Book(pages);

        //Problem1
        SearchBook searchBook = new SearchBook();
        int number = searchBook.Search(book);
        System.out.println("Your book is NO." + number);

        //Problem2
        GenericSearch genericSearch = new GenericSearch();
        PageChecker pageChecker = new PageChecker();
        number = genericSearch.Search(book,pageChecker);
        System.out.println("Generic search : " + number);

        //Problem3
        GenericSearchList genericSearchList = new GenericSearchList();
        pageChecker = new PageChecker();
        List<Page> list = genericSearchList.Search(book,pageChecker);
        for(Page page : list){
            //p1&p3 can get pages to list
            System.out.println("Your searching page is : "+ page.getPageNumber());
        }
    }

}