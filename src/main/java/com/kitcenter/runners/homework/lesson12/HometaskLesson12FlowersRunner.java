package com.kitcenter.runners.homework.lesson12;

import com.kitcenter.app.homework.lesson12.*;

public class HometaskLesson12FlowersRunner {
    public static void main(String[] args) {
        Flower rose = new Rose();
        Flower tulip = new Tulip();
        Flower rose2 = new Rose();
        Flower tulip2 = new Tulip();
        Flower carnation = new Carnation();
        Flower magnolia = new Magnolia();
        new Bouquet (rose, tulip);
        new Bouquet(rose, rose2);
        new Bouquet (tulip, tulip2);
        new Bouquet(carnation, magnolia);

    }
}
