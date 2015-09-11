package com.mike.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by michaelbrennan on 9/11/15.
 */
public class IntersectionModel implements Serializable {

    List<Integer> intersectionData;

    public IntersectionModel(List<Integer> intersectionData) {
        this.intersectionData = intersectionData;
    }

    public List<Integer> getIntersectionData() {
        return intersectionData;
    }

    public void setIntersectionData(List<Integer> intersectionData) {
        this.intersectionData = intersectionData;
    }
}
