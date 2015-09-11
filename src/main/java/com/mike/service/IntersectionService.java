package com.mike.service;

import com.mike.model.IntersectionModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Michael Brennan on 9/11/15.
 * Find the intersection of two arrays, like {1,3,5,7,9}, {1,2,3,4,5}; the intersection is {1,3,5}
 */
@Service
public class IntersectionService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public IntersectionModel getIntersection(Integer[] arr1, Integer[] arr2){
        if (arr1.length == 0 || arr2.length == 0) {
            logger.debug("Empty array: no intersection data");
            return new IntersectionModel(new ArrayList<>());
        }
        return new IntersectionModel(arr1.length <= arr2.length ?intersectionOf(arr1, arr2):intersectionOf(arr2, arr1));
    }

    private List<Integer> intersectionOf(Integer[]smaller, Integer[]bigger){
        List<Integer> intersection = new ArrayList<>();
        List<Integer> bigList =
                Arrays.stream(bigger)
                .collect(Collectors.toList());
        for (int i : smaller){
            if (bigList.contains(i)){
                if (!intersection.contains(i)){ //only add number if it is not already contained
                    logger.debug("Intersectional Data: " + i);
                    intersection.add(i);
                }
            }
        }
        if (intersection.isEmpty()){
            logger.debug("No intersecting data was found");
        }
        Collections.sort(intersection);
        return intersection;
    }

    public static void main(String[] args) {

    }
}
