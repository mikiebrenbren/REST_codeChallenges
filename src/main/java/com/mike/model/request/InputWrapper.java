package com.mike.model.request;

import java.io.Serializable;
import java.util.List;

/**
 * Created by michaelbrennan on 9/11/15.
 */
public class InputWrapper implements Serializable {

    List<Integer[]> arr1;

    public List<Integer[]> getArr1() {
        return arr1;
    }

    public void setArr1(List<Integer[]> arr1) {
        this.arr1 = arr1;
    }
}
