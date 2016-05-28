package io.akeredolu;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by mikailaakeredolu on 5/28/16.
 */
public class SetTest {
    @Test
    public void add() throws Exception {
        ArrayList<Integer> mySet = new ArrayList<Integer>();
        mySet.add(8);
        mySet.add(4);
        mySet.add(5);
        mySet.add(3);
        int expectedValue = 5;
        int actualValue =  mySet.get(2);
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void addAll() throws Exception {
        Set<Integer> mySet = new Set<Integer>();
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList1.add(100);
        arrayList2.add(200);
        mySet.addAll(arrayList1);
        mySet.addAll(arrayList2);
        int expectedValue = 100;
        int actualValue =  mySet.get(0);
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void clear() throws Exception {

        Set<Object>mySet1 = new Set<Object>();
        ArrayList<Integer>arrayListC = new ArrayList<Integer>();
        arrayListC.add(100);
        mySet1.add(arrayListC);
        mySet1.clear();
         Object expectedValue = null;
         Object actualValue = mySet1.get(0);
        Assert.assertEquals(expectedValue,actualValue);

    }

    @Test
    public void containsTest() throws Exception {
        Set<Object>mySet2 = new Set<Object>();
        ArrayList<Integer>anArrObj = new ArrayList<Integer>();
        mySet2.add(anArrObj);
        Object expectedValue = true;
        Object actualValue = mySet2.contains(anArrObj);
        Assert.assertEquals(expectedValue,actualValue);

    }

    @Test
    public void containsAllTest() throws Exception {
        Set<Object>mySet3 = new Set<Object>();
        ArrayList<Integer>Obj1 = new ArrayList<Integer>();
        Obj1.add(2);
        Obj1.add(3);
        mySet3.addAll(Obj1);
        boolean expectedValue = true;
        boolean actualValue = mySet3.containsAll(Obj1);
        Assert.assertEquals(expectedValue,actualValue);

    }


}