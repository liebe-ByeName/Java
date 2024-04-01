package com.example.demo1.transports;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileNotFoundException;

public abstract class Transport
{
    final ImageView imgView;
    public Transport(int x,int y, Image img) throws FileNotFoundException{
        imgView = new ImageView(img);
        imgView.setLayoutX(x);
        imgView.setLayoutY(y);
        imgView.setFitWidth(80);
        imgView.setFitHeight(90);
//            imgView.setPreserveRatio(true);
    }
    public ImageView getImageView() {return imgView;}
}
