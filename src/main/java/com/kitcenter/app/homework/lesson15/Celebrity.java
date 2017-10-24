package com.kitcenter.app.homework.lesson15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Celebrity {
    GENTLEMAN (42, "alive"),
    ALBOROSIE (40, "alive"),
    BOB_MARLEY (36, "dead");
    int age;
    String aliveOrNot;
    Celebrity (int age, String aliveOrNot) {
        this.age=age;
        this.aliveOrNot=aliveOrNot;
    }
    public int getValue () {
        return age;
    }
    private static final List<Celebrity> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Celebrity randomArtist()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
    public static String getAliveOrNot (Celebrity celeb) {
        return celeb.aliveOrNot;
    }
}
