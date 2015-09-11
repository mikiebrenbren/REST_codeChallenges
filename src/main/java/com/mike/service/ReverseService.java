package com.mike.service;

import com.mike.model.ReverseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by michaelbrennan on 9/11/15.
 */
@Service
public class ReverseService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /*
    Reverse a string without using existing an existing reversal method in JDK,
    like “Jacky is a dog” to “ykcaJ si a god” and/or  “Jacky is a dog” to “god a si ykcaJ”
     */

    public ReverseModel reverse(String s){
        char [] chars = s.toCharArray();
        char [] revChars = new char[chars.length];
        int newCharCount = 0;
        for (int i = chars.length - 1; i >= 0; i--){
            revChars[newCharCount] = chars[i];
            newCharCount++;
        }

        String revString = String.valueOf(revChars);
        logger.debug("Reversed string: " + revString);
        return new ReverseModel(revString);
    }
}
