package com.example.sem04_zad1_uloha1;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Pane root;

    @FXML
    protected void pridajRectangle() {
        double x = Math.random() * 450 + 20;
        double y = Math.random() * 250 + 50;
        MyRectangle rect = new MyRectangle(x, y, 5, Color.RED);
        root.getChildren().add(rect);
    }

    @FXML
    protected void pridajCircle() {
        double x = Math.random() * 450 + 50;
        double y = Math.random() * 220 + 80;
        MyCircle circle = new MyCircle(x, y, 5, Color.GREEN);
        root.getChildren().add(circle);
    }

    @FXML
    protected void pridajSquare() {
        double x = Math.random() * 450 + 20;
        double y = Math.random() * 250 + 50;
        MySquare square = new MySquare(x, y, 5, Color.ORANGE);
        root.getChildren().add(square);
    }

    @FXML
    protected void zmenFarbuKruhovNaModru() {
        for (int i = 0; i < root.getChildren().size(); i++) {
            Node my = root.getChildren().get(i);
            if (my instanceof MyCircle) {
                ((MyCircle) my).zmenaFarby(Color.BLUE);
            }
        }
    }

    @FXML
    protected void posunVsetkyDole() {
        for (int i = 0; i < root.getChildren().size(); i++) {
            Node my = root.getChildren().get(i);
            if (my instanceof GeometricShape) {
                ((GeometricShape) my).posunDole30();
            }
        }
    }

}
