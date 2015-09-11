package com.mike.controller;

import com.mike.model.BuzzModel;
import com.mike.model.ReverseModel;
import com.mike.service.BuzzService;
import com.mike.service.ReverseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by michaelbrennan on 9/10/15.
 */
@RestController
@RequestMapping("/")
public class Controller {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    BuzzService buzzService;

    @Autowired
    ReverseService reverseService;

    @RequestMapping("buzz")
    public ResponseEntity<BuzzModel> buzz(HttpServletRequest request, HttpServletResponse response){
        return new ResponseEntity<>(buzzService.buzz(), HttpStatus.OK);
    }

    @RequestMapping("reverse/{s}")
    public ResponseEntity<ReverseModel> reverse(HttpServletRequest request, HttpServletResponse response, @PathVariable String s){
        return new ResponseEntity<>(reverseService.reverse(s), HttpStatus.OK);
    }



}