package io.akeredolu;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
/**
 * Created by mikailaakeredolu on 5/27/16.
 */
public class SetTest {

    @Test
    public void addTest(){
        ArrayList<Integer>mySet = new ArrayList<Integer>();
        mySet.add(8);
        mySet.add(4);
        mySet.add(5);
        mySet.add(3);
        int expectedValue = 5;
        int actualValue =  mySet.get(2);
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void addAllTest(){
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
}
