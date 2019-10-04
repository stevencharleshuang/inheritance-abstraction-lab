package com.company;

public class Custodian extends CustodianActions {
    private String name;

    public Custodian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void cleanMess() {
        System.out.println(name + ": Time to get out the mop...");
    }

    @Override
    public void cleanVomit() {
        System.out.println("Custodian " + name + ": Ugh...time to get out the sawdust...");
    }
}
