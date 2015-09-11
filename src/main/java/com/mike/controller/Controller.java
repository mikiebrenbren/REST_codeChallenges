package com.mike.controller;

import com.mike.model.BuzzModel;
import com.mike.model.IntersectionModel;
import com.mike.model.ReverseModel;
import com.mike.model.request.InputWrapper;
import com.mike.service.BuzzService;
import com.mike.service.IntersectionService;
import com.mike.service.ReverseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * Created by Michael Brennan on 9/10/15.
 */
@RestController
@RequestMapping("/")
public class Controller {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    BuzzService buzzService;

    @Autowired
    ReverseService reverseService;

    @Autowired
    IntersectionService intersectionService;

    @RequestMapping("buzz")
    public ResponseEntity<BuzzModel> buzz(HttpServletRequest request, HttpServletResponse response){
        return new ResponseEntity<>(buzzService.buzz(), HttpStatus.OK);
    }

    @RequestMapping("reverse/{s}")
    public ResponseEntity<ReverseModel> reverse(HttpServletRequest request, HttpServletResponse response, @PathVariable String s){
        return new ResponseEntity<>(reverseService.reverse(s), HttpStatus.OK);
    }

    @RequestMapping(value = "intersection", method = RequestMethod.POST)
    public ResponseEntity<IntersectionModel> intersection(HttpServletRequest request, HttpServletResponse response, @RequestBody InputWrapper inputWrapper){
        if(inputWrapper.getArr1().size() != 2){
            return new ResponseEntity<>(new IntersectionModel(new ArrayList<>()), HttpStatus.BAD_REQUEST);  //must be two arrays to compare
        }
        return new ResponseEntity<>(intersectionService.getIntersection(inputWrapper.getArr1().get(0), inputWrapper.getArr1().get(1)), HttpStatus.OK);
    }


}