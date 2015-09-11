package com.mike

import com.mike.model.BuzzModel
import com.mike.model.IntersectionModel
import com.mike.service.BuzzService
import com.mike.service.IntersectionService
import com.mike.service.ReverseService
import com.mike.util.Constants
import groovy.util.logging.Slf4j
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise

/**
 * Created by Michael Brennan on 9/10/15.
 */
@Slf4j
@Stepwise
class TestCases extends Specification{

    @Shared
    IntersectionService intersectionService
    @Shared
    IntersectionModel intersectionModel

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


    def "intersections"(){
        when:
        intersectionService = new IntersectionService();
        def arr1 = [3,4,5,9,10] as Integer[]
        def arr2 = [9, 2] as Integer []
        intersectionModel = intersectionService.getIntersection(arr1, arr2)

        then:
        intersectionModel.getIntersectionData().size() == 1
        intersectionModel.getIntersectionData().contains(9)

    }

    def "intersections 2"(){
        when:
        intersectionService = new IntersectionService();
        def arr1 = [3,4,5,9,10] as Integer []
        def arr2 = [9, 2, 0, 5] as Integer []
        intersectionModel = intersectionService.getIntersection(arr1, arr2)

        then:
        intersectionModel.getIntersectionData().size() == 2
        intersectionModel.getIntersectionData().contains(9)
        intersectionModel.getIntersectionData().contains(5)
    }

    def "intersections 3 test duplicate intersections"(){
        when:
        intersectionService = new IntersectionService();
        def arr1 = [5,5,5,5] as Integer []
        def arr2 = [5, 5, 5, 5] as Integer []
        intersectionModel = intersectionService.getIntersection(arr1, arr2)

        then:
        intersectionModel.getIntersectionData().size() == 1
        intersectionModel.getIntersectionData().contains(5)
    }

    def "intersections 4 test empty arrays"(){
        when:
        intersectionService = new IntersectionService();
        def arr1 = [] as Integer []
        def arr2 = [4] as Integer []

        def arr3 = [3] as Integer []
        def arr4 = [] as Integer []

        def arr5= [] as Integer []
        def arr6 = [] as Integer []
        intersectionModel = intersectionService.getIntersection(arr1, arr2)
        IntersectionModel intersectionModel1 = intersectionService.getIntersection(arr3, arr4)
        IntersectionModel intersectionModel2 = intersectionService.getIntersection(arr5, arr6)

        then:
        intersectionModel.getIntersectionData().isEmpty()
        intersectionModel1.getIntersectionData().isEmpty()
        intersectionModel2.getIntersectionData().isEmpty()
    }
}
