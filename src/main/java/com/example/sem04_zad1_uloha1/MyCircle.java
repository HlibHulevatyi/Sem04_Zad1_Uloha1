package com.example.sem04_zad1_uloha1;

import javafx.scene.paint.Color;

public class MyCircle extends GeometricShape {
    private double uhol = 0;
    private double stredX;
    private double stredY;
    private double polomer = 35;

    public MyCircle(double x, double y, double r, Color c) {
        super(x, y, r, c);
        this.stredX = x;
        this.stredY = y;
        vykresli();
    }

    @Override
    protected void vykresli() {
        gc.clearRect(0,0, getWidth(), getHeight());
        gc.setFill(color);
        gc.fillOval(10,10,30,30);
    }

    @Override
    protected void pohyb() {
        uhol += 0.1;
        setLayoutX(stredX + polomer * Math.cos(uhol));
        setLayoutY(stredY + polomer * Math.sin(uhol));

    }

    @Override
    public void posunDole30() {
        super.posunDole30();
        stredY += 30;
    }
}
