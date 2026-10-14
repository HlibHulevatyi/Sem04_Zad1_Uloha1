package com.example.sem04_zad1_uloha1;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public abstract class GeometricShape extends Canvas {
    protected GraphicsContext gc;
    protected Color color;
    protected double rychlost;
    private Timeline casovac;

    protected abstract void vykresli();
    protected abstract void pohyb();

    public GeometricShape (double x, double y, double r, Color c) {
        super(50,50);
        this.setLayoutX(x);
        this.setLayoutY(y);
        this.rychlost = r;
        this.color = c;
        this.gc = getGraphicsContext2D();

        casovac = new Timeline(new KeyFrame(Duration.millis(50), e ->{
            pohyb();
            vykresli();
        }));
        casovac.setCycleCount(Animation.INDEFINITE);
        casovac.play();
    }

    public void zmenaFarby(Color c) {
        this.color = c;
        vykresli();
    }

    public void posunDole30() {
        setLayoutY(getLayoutY() + 30);

    }
}
