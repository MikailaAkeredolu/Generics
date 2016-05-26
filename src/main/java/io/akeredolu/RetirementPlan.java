package io.akeredolu;

/**
 * Created by mikailaakeredolu on 5/25/16.
 */
public class RetirementPlan {

    private int initialBalance;
    private float savingPercent;

    public RetirementPlan(int initialBalance, float savingPercent) {
        this.initialBalance = initialBalance;
        this.savingPercent = savingPercent;
    }

    public void add(int amount){
        initialBalance = initialBalance + amount;
    }

    public void grow(){
        //some logic to grow retirement plan
    }
}
