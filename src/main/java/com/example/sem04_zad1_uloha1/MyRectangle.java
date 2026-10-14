package com.example.sem04_zad1_uloha1;

import javafx.scene.paint.Color;

public class MyRectangle extends GeometricShape {
    public MyRectangle(double x, double y, double r, Color c) {
        super(x, y, r, c);
        vykresli();
    }

    @Override
    protected void pohyb() {
        if (getLayoutX() > 540 || getLayoutX() < 10) {
            rychlost = -rychlost;
        }
        setLayoutX(getLayoutX() + rychlost);
    }

    @Override
    protected void vykresli() {
        gc.clearRect(0, 0, getWidth(), getHeight());
        gc.setFill(color);
        gc.fillRect(5, 15, 40, 20);
    }

}
