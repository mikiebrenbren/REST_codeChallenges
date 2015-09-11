package com.mike.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by michaelbrennan on 9/10/15.
 */
public class BuzzModel implements Serializable {

    List<String> buzz;

    public BuzzModel(){
        buzz = new ArrayList<>();
    }

    public List<String> getBuzz() {
        return buzz;
    }

    public void setBuzz(List<String> buzz) {
        this.buzz = buzz;
    }
}
