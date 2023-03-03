package com.example.stream_api___optional;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.
                asList(6, 18, 26, 51, 90, 233, 54, 27, 94, 101));
        int n2 = (int) (numbers.stream().filter((n) -> (n % 2) == 0)).count();
        System.out.println("количество четных чисел = " + n2);

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(10);
        list.add(1);
        list.add(167);
        list.add(1056);
        list.add(-567);
        list.add(481);
        list.add(0);
        list.add(0);
        findMinMax(list.stream(), (v1, v2) -> v2 - v1, (v1, v2) -> System.out.println("максимальное значение - " + v1 + " , минимальное значение - " + v2));

    }

    public static <Collection> void findMinMax(Stream<? extends Collection> stream, Comparator<? super Collection> order,
                                      BiConsumer<? super Collection, ? super Collection> minMaxConsumer) {
        List<? extends Collection> list = stream.sorted(order).toList();
        minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));


    }


}



