package io.akeredolu;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mikailaakeredolu on 5/25/16.
 */
public class MyArrayListTest {
    @Test
    public void add() throws Exception {
        MyArrayList<Integer>myList = new MyArrayList<Integer>();
        myList.add(4);
        myList.add(4);
        myList.add(4);
        myList.add(4);
        myList.add(4);
        myList.add(4);
        myList.add(4);
        myList.add(4);
        myList.add(4);
        myList.add(4);
        myList.add(4);
        myList.add(4);
        myList.add(4);
        int expectedValue = 4;
        int actualValue = myList.get(0);
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void add1() throws Exception {
        MyArrayList<Integer>myList2 = new MyArrayList<Integer>();
        myList2.add(4);
        myList2.add(0,10);
        int expectedValue = 10;
        int actualValue = myList2.get(0);
        Assert.assertEquals(expectedValue,actualValue);

    }

    @Test
    public void get() throws Exception {
        MyArrayList<Integer>myList4 = new MyArrayList<Integer>();
        myList4.add(007);
        int expectedValue = 007;
        int actualValue = myList4.get(0);
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void remove() throws Exception {
        MyArrayList<Integer>myList3 = new MyArrayList<Integer>();
        myList3.add(4);
        myList3.add(7);
        myList3.remove(0);
        int expectedValue = 7;
        int actualValue = myList3.get(0);
        Assert.assertEquals(expectedValue,actualValue);

    }

    @Test
    public void set() throws Exception {
        MyArrayList<Integer>myList5 = new MyArrayList<Integer>();
        myList5.add(4);
        myList5.add(7);
        myList5.set(1,10);
        int actualValue = myList5.get(1);
        int expectedValue = 10;
        Assert.assertEquals(expectedValue,actualValue);

    }

    @Test
    public void clear() throws Exception {
        MyArrayList<String>myList6 = new MyArrayList<String>();
        myList6.add("69");
        myList6.clear();
        String actualValue = myList6.get(0);
        String expectedValue = null;
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void isEmpty() throws Exception {
        MyArrayList<Integer>myList7 = new MyArrayList<Integer>();
        myList7.add(1);
        myList7.remove(0);
        Integer actualValue = myList7.get(0);
        Integer expectedValue = null;
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void contains() throws Exception {
        MyArrayList<String>myList7 = new MyArrayList<String>();
        myList7.add("Mary");
        boolean actualValue = myList7.contains("Mary");
        Assert.assertTrue(actualValue);

    }

    @Test
    public void resize() throws Exception{
        MyArrayList<Integer>myList9 = new MyArrayList<Integer>();
        myList9.resizeArray();
        int actualValue = myList9.arrayObject.length;
        int expectedValue = 14;
        Assert.assertEquals(expectedValue,actualValue);

    }

}