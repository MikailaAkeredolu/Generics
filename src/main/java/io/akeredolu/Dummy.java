package io.akeredolu;

/**
 * Created by mikailaakeredolu on 5/25/16.
 */
public class Dummy {


    public int multiply(int[][] matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
