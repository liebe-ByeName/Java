package com.example.demo1.managment;

import com.example.demo1.managment.CarContainer;
import com.example.demo1.transports.Car;
import com.example.demo1.transports.Moto;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.util.Random;

public class Habitat {
    @FXML
    private ChoiceBox<String> passengerChoiceBox,truckChoiceBox;
    @FXML
    private TextField truckTextField,passengerTextField;

    private static final int width = 1920;
    private static final int height = 1018;
    private CarContainer carContainer = CarContainer.getInstance();
    private float p1 = 0.5f; //вероятность грузовых авто
    private float p2 = 0.5f; //вероятность пассажирских авто
    private int n1 = 2;
    private int n2 = 3;

    public void setTruckProbability(float probability) {
        this.p1 = probability;
    }
    public void setTruckTime(int time) {
        this.n1 = time;
    }

    public void setPassengerProbability(float probability) {
        this.p2 = probability;
    }
    public void setPassengerTime(int time) {
        this.n2 = time;
    }
    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }
    public int Update(long time) throws FileNotFoundException {
        long newTime = time/1000;
        int number = 0;
        Random rand = new Random();
        float p = rand.nextFloat();
        try {
            if ((newTime % n1 == 0) && (p1 >= p)) {
                number++;
                Moto moto = new Moto(rand.nextInt(0, width - 80)  , rand.nextInt(0, height - 180)  );
                carContainer.addCar(moto);
            }
            if ((newTime % n2 == 0) && (p2 >= p)) {
                number++;
                Car car = new Car(rand.nextInt(0, width - 80) , rand.nextInt(0, height - 180) );
                carContainer.addCar(car);
            }
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        return number;
    }
    public CarContainer getCarContainer() {
        return carContainer;
    }
}