package com.mike.model;

import java.io.Serializable;

/**
 * Created by Michael Brennan on 9/11/15.
 */
public class FactorialModel implements Serializable{

    Integer factorial;

    public FactorialModel() {
    }
    public FactorialModel(Integer factorial) {
        this.factorial = factorial;
    }

    public Integer getFactorial() {
        return factorial;
    }

    public void setFactorial(Integer factorial) {
        this.factorial = factorial;
    }
}
