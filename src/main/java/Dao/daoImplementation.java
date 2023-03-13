package Dao;

import static java.lang.Math.random;

public class daoImplementation implements  daoInterface{
    @Override
    public double getData() {
        System.out.println("First Version");
        double value = Math.random();
        return value;
    }
}
