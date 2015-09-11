package com.mike.service;

import com.mike.model.BuzzModel;
import com.mike.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Michael Brennan on 9/10/15.
 Print all of the numbers from 1 to 100 Each number on a new line
 Except, if a number contains a 7, is a multiple of 7,
 or is a repeating number (such as 11, 22, 33, etc.), print the word buzz on that line, instead of the number
 */
@Service
public class BuzzService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public BuzzModel buzz(){
        BuzzModel buzzModel = new BuzzModel();
        for (int i = 1; i < 101; i++){
            if(i % 7 == 0){
                logger.debug(Constants.BUZZ);
                buzzModel.getBuzz().add(Constants.BUZZ);
            }else if(isRepeatingNum(i)){
                logger.debug(Constants.BUZZ);
                buzzModel.getBuzz().add(Constants.BUZZ);
            }
            else {
                logger.debug(i+"");
                buzzModel.getBuzz().add(i+"");
            }
        }
        return buzzModel;
    }

    private boolean isRepeatingNum(int i ){
        String num = i + "";
        if(num.length() < 2){
            return false;
        }else {
            char[] charArray = num.toCharArray();
            char nextChar = 'z';
            for (char c : charArray){
                if (nextChar == 'z'){
                    nextChar = c;
                }else if(nextChar == c){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }

}
