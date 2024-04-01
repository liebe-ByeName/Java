package com.example.demo1.transports;

import com.example.demo1.managment.IBehaviour;
import javafx.scene.image.Image;

import java.io.FileNotFoundException;

public class Moto extends Transport implements IBehaviour {

    public static int intMoto = 0;

    public Moto(int x,int y) throws FileNotFoundException {
        super(x,y,new Image("moto.png")) ;
        intMoto++;
    }
}
