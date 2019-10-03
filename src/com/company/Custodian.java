package com.company;

public class Custodian extends CustodianActions {
    private String name;

    public Custodian(String name) {
        this.name = name;
    }

    @Override
    public void cleanMess() {
        System.out.println("Time to get out the mop...");
    }

    @Override
    public void cleanVomit() {
        System.out.println("Ugh...time to get out the sawdust...");
    }
}