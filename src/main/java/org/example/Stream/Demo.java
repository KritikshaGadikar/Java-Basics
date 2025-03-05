package org.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(4,5,7,9,6);

//        Stream<Integer> s1 = nums.stream();                      // for getting all value       //we cannot reused stream you can see for each thing we have created sepreate stream ...s1, s2, s3
//        Stream<Integer> s2 = s1.filter(n -> n%2==0);            // for getting even
//        Stream<Integer> s3 = s2.map(n -> n*2);                   //for getting double of even
//        int result = s3.reduce(0, (c,e) -> c+e);



        //from 12 to 15 we can write lke this also
        int result = nums.stream()
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .reduce(0, (c,e) -> c+e);

        System.out.println(result);


//        s1.forEach(n -> System.out.println(n));
//        s2.forEach(n -> System.out.println(n));
        //s3.forEach(n -> System.out.println(n));
    }
}
