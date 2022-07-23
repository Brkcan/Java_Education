package org.education.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Stream;

public final class StreamUtil {
    private StreamUtil()
    {
    }

     public static <T, R> R filter(Stream<T> stream, Predicate<? super T> pred,
                                   Collector<? super T, ?, R> coll)
     {
         return stream.filter(pred).collect(coll);
     }

    public static <T, R> R filter(List<T> list, Predicate<? super T> pred,
                                  Collector<? super T, ?, R> coll)
    {
        return filter(list, pred, coll);
    }

    public static <T, R> R filter(T [] a, Predicate<? super T> pred,
                                  Collector<? super T, ?, R> coll)
    {
        return filter(Arrays.stream(a), pred, coll);
    }


    public static <T, R> T map(Stream<R> stream, Function<? super R, ? extends T> map,
                                  Collector<? super Object, R, T> coll)
    {
        return stream.map(map).collect(coll);
    }

//    public static void map(Stream<Random> limit, Function<? super Random,?> function, Collector<Object,?, List<Object>> toList)
//    {
//    }
}
