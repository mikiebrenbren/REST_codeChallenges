package com.mike.model;

import java.io.Serializable;

/**
 * Created by michaelbrennan on 9/11/15.
 */
public class ReverseModel implements Serializable {

    String reversedWord;

    public ReverseModel(String s){
        reversedWord = s;
    }

    public String getReversedWord() {
        return reversedWord;
    }

    public void setReversedWord(String reversedWord) {
        this.reversedWord = reversedWord;
    }
}
