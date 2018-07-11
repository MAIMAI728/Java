package IteratorIterable;

/**
 * Created by mai on 2017/07/06.
 */

public class Page{

    //Pageに必要なもの
    private int pageNumber;
    private boolean hasImage;
//    int ChapterNumber;


    //constructor
    public Page(int pageNumber,boolean hasImage){
        this.pageNumber = pageNumber;
        this.hasImage = hasImage;
    }

    //getterとsetter
    public int getPageNumber() {
        return pageNumber;
    }
    public boolean HasImage() {
        return hasImage;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    public void setHasImage(boolean hasImage) {
        this.hasImage = hasImage;
    }



}
