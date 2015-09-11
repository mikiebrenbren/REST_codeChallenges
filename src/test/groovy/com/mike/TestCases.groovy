package com.mike

import com.mike.model.BuzzModel
import com.mike.service.BuzzService
import com.mike.service.ReverseService
import com.mike.util.Constants
import groovy.util.logging.Slf4j
import spock.lang.Specification
import spock.lang.Stepwise

/**
 * Created by Michael Brennan on 9/10/15.
 */
@Slf4j
@Stepwise
class TestCases extends Specification{


    def "testBuzz"(){
        when:
        BuzzService buzzService = new BuzzService()
        BuzzModel buzzModel = buzzService.buzz()


        then:
        buzzModel.getBuzz().get(0) == 1+""
        buzzModel.getBuzz().get(7-1) == Constants.BUZZ
        buzzModel.getBuzz().get(11-1) == Constants.BUZZ
        buzzModel.getBuzz().get(33-1) == Constants.BUZZ
        buzzModel.getBuzz().get(98-1) == Constants.BUZZ
        buzzModel.getBuzz().get(77-1) == Constants.BUZZ
        buzzModel.getBuzz().get(93-1) == 93+""
        buzzModel.getBuzz().get(100-1) == 100+""

    }

    def "test Reverse"(){
        when:
        ReverseService reverseService = new ReverseService()


        then:
        reverseService.reverse("god").getReversedWord() == "dog"
        reverseService.reverse("sizzler").getReversedWord() == "relzzis"
        reverseService.reverse("I am a human being").getReversedWord() == "gnieb namuh a ma I"
        reverseService.reverse("i").getReversedWord() == "i"
    }


}
