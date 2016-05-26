package io.akeredolu;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mikailaakeredolu on 5/25/16.
 */
public class DummyTest {

    @Test
    public void shouldMultiplyMatrix(){
        Dummy dummy = new Dummy();
        int[][] matrix = new int[3][3];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(i%2==0) {
                    matrix[i][j] = 2;
                }else{
                    matrix[i][j] = 1;
                }
            }
        }

        assertEquals(dummy.multiply(matrix), 0);

    }

}