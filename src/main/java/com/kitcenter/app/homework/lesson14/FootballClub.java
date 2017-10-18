package com.kitcenter.app.homework.lesson14;

public class FootballClub extends SportsClub {
    int wins;
    int draws;
    int defeats;
    public void showName() {
        System.out.println("showName");
    }
    public void showLocation () {
        System.out.println("showLocation");
    }
    public void showStatistic() {
        System.out.println("showStatistics");
    }

    public void wins(int wins) {
        this.wins = wins;
    }

    public void draws(int draws) {
        this.draws = draws;
    }

    public void defeats(int defeats) {
        this.defeats = defeats;
    }
}
