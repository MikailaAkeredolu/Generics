package io.akeredolu;
import java.util.Collection;

/**
 * Created by mikailaakeredolu on 5/27/16.
 */
public class Set<T> extends MyArrayList<T> {

    public void add (T element) {
    super.add(element);
    }

    public void addAll(Collection<? extends  T> collection){
        if (collection != null){
            for(int x = 0; x < collection.size(); x++){
                    super.add((T)collection.toArray()[x]);
            }
        }
    }

      public void clear(){
          super.clear();
    }

    public void contains(){
        super.contains(arrayObject);
    }

    public boolean containsAll(Collection<?> collection)
    {
        if (collection != null){
            for(int x = 0; x < collection.size(); x++){

                for (int y = 0; y < arrayObject.length; y++){

                    if (collection.toArray()[x].equals(arrayObject[y])){
                            return true;
                    }
                }

            }
        }
        return false;
    }


//check for duplicates in set with if statement



}






