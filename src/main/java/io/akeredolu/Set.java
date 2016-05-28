package io.akeredolu;

import java.util.Collection;

/**
 * Created by mikailaakeredolu on 5/27/16.
 */
public class Set<T> extends MyArrayList<T> {

public void add (T element){
    super.add(element);
}

    public void addAll(Collection<? extends  T> collection){

        //check if c is not present
        if (collection != null){
            for(int x = 0; x < collection.size(); x++){
                    super.add((T)collection.toArray()[x]);
            }
        }















    }













}
