package com.example.demo1.transports;

import com.example.demo1.managment.IBehaviour;
import javafx.scene.image.Image;

import java.io.FileNotFoundException;

public class Car extends Transport implements IBehaviour {
    public static int intCar = 0;
    public Car(int x,int y) throws FileNotFoundException {
        super(x,y, new Image("Car.png")) ;
        intCar++;
    }
}
