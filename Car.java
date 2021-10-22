/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garageapp;

import java.io.Serializable;

/**
 *
 * @author Nathan
 */

//implements Serializable is needed for ObjectOutputStream.writeObject
public class Car implements Serializable {

    private String color, brand, model;

    public Car() {
        color = "";
        brand ="";
        model="";
    }
    
    public Car(String brand, String model, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String make) {
        this.model = make;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
