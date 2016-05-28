package io.akeredolu;

/**
 * Created by mikailaakeredolu on 5/25/16.
 */
public class MyArrayList<T> {

    int maxSize = 7;
    Object[] arrayObject = new Object[maxSize];

    int size = 0;


    //default array constructor
    public MyArrayList() {

    }

    //change size of array object
    public MyArrayList(int oneArgument) {

        arrayObject = new Object[oneArgument];
    }

    //add to end of list
    public void add(T t) {
        resizeArray();
        arrayObject[size] = t;
        size++;
    }

    //add to specified index. Element is the thing you want to add to the array
    public void add(int index, T element) {
        resizeArray();
        for (int x = arrayObject.length - 1; x > index; x--) {
            arrayObject[x] = arrayObject[x - 1];
        }
        arrayObject[index] = element;
    }


    public T get(int index) {

        return (T) arrayObject[index];
    }

    //reducing size of array and making current = previous

    public T remove(int index) {

        Object[] smallArray = new Object[arrayObject.length - 1];
        // resizeArray();
        for (int x = index; x < arrayObject.length - 1; x++) { //check if we need a bigger size
            smallArray[x] = arrayObject[x + 1]; //replacement changing
        }
        arrayObject = smallArray;  // reassign small array to original

        return (T) smallArray;
    }


    public T set(int index, T element) {

        return (T) (arrayObject[index] = element);
    }

    public void clear() {

        arrayObject = new Object[7];

    }

    public boolean isEmpty() {
        for (int x = 0; x < arrayObject.length; x++) {
            if (arrayObject[x] != null) {
                return false;
            }
        }
        return true;
    }

    //checking if something contains an object
    public boolean contains(Object o) {
        for (int x = 0; x < arrayObject.length; x++) {
            if (o.equals(arrayObject[x])) {
                return true;
            }
        }
        return false;
    }

    public void resizeArray() {
        if (size == arrayObject.length - 1) {
            Object[] largerArray = new Object[arrayObject.length * 2]; //Increase size of array by two

            for (int i = 0; i < arrayObject.length; i++) {
                largerArray[i] = arrayObject[i];
            }

            arrayObject = largerArray;

        }
    }


}



