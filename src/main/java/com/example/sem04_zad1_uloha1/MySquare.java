package com.example.sem04_zad1_uloha1;

import javafx.scene.paint.Color;

public class MySquare extends GeometricShape {

        public MySquare(double x, double y, double r, Color c) {
            super(x, y, r, c);
            vykresli();
        }

        @Override
        protected void pohyb() {
            if (getLayoutY() > 340 || getLayoutY() < 45) {
                rychlost = -rychlost;
            }
            setLayoutY(getLayoutY() + rychlost);
        }

        @Override
        protected void vykresli() {
            gc.clearRect(0, 0, getWidth(), getHeight());
            gc.setFill(color);
            gc.fillRect(10, 10, 30, 30);
        }
}
