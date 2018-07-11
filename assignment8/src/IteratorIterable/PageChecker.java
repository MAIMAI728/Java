package IteratorIterable;

import java.security.PublicKey;

/**
 * Created by mai on 2017/07/07.
 */
public class PageChecker implements Checker<Page> {
    public boolean Check(Page p){
        if(p.HasImage() && (p.getPageNumber()%2==0)){
            return true;
        }
        return false;
    }

}
