package com.kitcenter.app.homework.lesson14;

public abstract class SportsClub {
    String name;
    String location;
    abstract void showName();
    abstract void showLocation ();
    abstract void  showStatistic();
    abstract void wins( int wins);
    abstract void draws(int draws);
    abstract void defeats (int defeats);

}
