package com.dataminds.tutorial;


import java.util.Arrays;
import java.util.stream.Stream;

public class TheArrays {

    public static void main(String[] args) {

        String[] colors = new String[5];
        Integer[] numbers = {121, 123};

        colors[0] = "color_1";
        colors[1] = "color_2";
        colors[2] = "color_3";

        for (String color : colors) {
            System.out.println(color);
        }

        Stream<String> aa = Arrays.stream(colors);

        aa.forEach(a -> System.out.println(a + "...."));

        System.out.println(numbers[1]);

        System.out.println(Days.MONDAY.getTitle());


    }

}
