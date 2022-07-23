//package org.education.stream;
//
//import java.util.Random;
//import java.util.function.Function;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class App24 {
//    public static void main(String[] args)
//    {
//        StreamUtil.map(Stream.generate(Random::new).limit(20), random -> random.nextInt(20), Collectors.toList());
//    }
//}
