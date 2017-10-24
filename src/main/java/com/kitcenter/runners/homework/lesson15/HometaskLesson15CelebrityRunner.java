package com.kitcenter.runners.homework.lesson15;

import com.kitcenter.app.homework.lesson15.Celebrity;

import java.util.*;

public class HometaskLesson15CelebrityRunner {
    public static void main(String[] args) {

        int counter =0;

        while (counter!=3) {
            List<Celebrity> enumValues = Arrays.asList(Celebrity.values());

            Celebrity cel;
            Set newSet = new HashSet();
            newSet.add(Celebrity.randomArtist());
            cel = (Celebrity) newSet.toArray()[ newSet.size()-1 ];

            System.out.println(cel);
            Scanner sc = new Scanner(System.in);
            int art = sc.nextInt();

            if (art == cel.getValue()) {
                System.out.println("Correct!");
                System.out.println("Guess alive or not?");
                Scanner sc2 = new Scanner(System.in);
                String guess = sc2.nextLine();
                String aliveStatus = cel.getAliveOrNot(cel);
                if (guess.equalsIgnoreCase(aliveStatus)) {
                    System.out.println("Right!");
                    counter++;

                } else {
                    System.out.println("Actually he is dead");
                }

            } else {
                System.out.println("Not correct");
            }

        }
        System.out.println("You won");
    }
}